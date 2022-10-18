package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  /** @example 040000 */
  var mode: js.UndefOr[String] = js.undefined
  
  /** @example test/file.rb */
  var path: js.UndefOr[String] = js.undefined
  
  /** @example 23f6827669e43831def8a7ad935069c8bd418261 */
  var sha: js.UndefOr[String] = js.undefined
  
  /** @example 12 */
  var size: js.UndefOr[Double] = js.undefined
  
  /** @example tree */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** @example https://api.github.com/repos/owner-482f3203ecf01f67e9deb18e/BBB_Private_Repo/git/blobs/23f6827669e43831def8a7ad935069c8bd418261 */
  var url: js.UndefOr[String] = js.undefined
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
