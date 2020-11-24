package typings.pouchdbMapreduce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object PouchDB {
  
  /**
    * CouchDB-style Map function
    *
    * @param emit CouchDB does not support emit as an argument and maps defined this way will always run locally
    */
  type Map[Content /* <: js.Object */, Result] = js.Function2[
    /* doc */ Content, 
    /* emit */ js.UndefOr[js.Function2[/* key */ js.Any, /* value */ Content | Result, scala.Unit]], 
    scala.Unit
  ]
  
  /**
    * CouchDB-style Reduction function
    *
    * @param keys From CouchDB documentation: Array of pairs of docid-key for related map function results;
    *             PouchDB may pass a simple array and also supports complex keys.
    */
  type Reducer[Content /* <: js.Object */, Reduction] = js.Function3[
    /* keys */ js.Any | scala.Null, 
    /* values */ js.Array[Content | Reduction], 
    /* rereduce */ scala.Boolean, 
    js.Array[Reduction] | Reduction
  ]
}
