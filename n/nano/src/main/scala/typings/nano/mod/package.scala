package typings.nano.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nano.mod.^
import typings.nano.nanoStrings.asc
import typings.nano.nanoStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(config: String): ServerScope = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[ServerScope]
/** nano entry function */
inline def apply(config: Configuration): ServerScope = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[ServerScope]

type Callback[R] = js.Function3[/* error */ RequestError | Null, /* response */ R, /* headers */ js.UndefOr[Any], Unit]

// -------------------------------------
// View
// -------------------------------------
type DocumentInfer[D] = js.Function1[/* doc */ D & Document, Unit]

type MangoValue = Double | String | js.Date | Boolean | js.Object | Null

/** Mango sort syntax
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax} */
type SortOrder = String | js.Array[String] | (StringDictionary[asc | desc])
