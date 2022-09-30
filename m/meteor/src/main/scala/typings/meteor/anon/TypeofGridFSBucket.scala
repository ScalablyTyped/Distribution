package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.meteorStrings.index
import typings.mongodb.mod.Db
import typings.mongodb.mod.GridFSBucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGridFSBucket
  extends StObject
     with Instantiable1[/* db */ Db, GridFSBucket] {
  
  /* Excluded from this release type: s */
  /**
    * When the first call to openUploadStream is made, the upload stream will
    * check to see if it needs to create the proper indexes on the chunks and
    * files collections. This event is fired either when 1) it determines that
    * no index creation is necessary, 2) when it successfully creates the
    * necessary indexes.
    * @event
    */
  val INDEX: index = js.native
}
