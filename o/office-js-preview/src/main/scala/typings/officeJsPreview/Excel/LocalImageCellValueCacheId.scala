package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The UID of a previously cached image.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait LocalImageCellValueCacheId extends StObject {
  
  /**
    * Represents the image's UID as it appears in the cache.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var cacheUid: String
}
object LocalImageCellValueCacheId {
  
  inline def apply(cacheUid: String): LocalImageCellValueCacheId = {
    val __obj = js.Dynamic.literal(cacheUid = cacheUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalImageCellValueCacheId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalImageCellValueCacheId] (val x: Self) extends AnyVal {
    
    inline def setCacheUid(value: String): Self = StObject.set(x, "cacheUid", value.asInstanceOf[js.Any])
  }
}
