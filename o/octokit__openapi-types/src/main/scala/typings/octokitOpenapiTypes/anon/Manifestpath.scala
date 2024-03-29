package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.development
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifestpath extends StObject {
  
  @JSName("package")
  val _package: js.UndefOr[EcosystemName] = js.undefined
  
  /** @description The full path to the dependency manifest file, relative to the root of the repository. */
  val manifest_path: js.UndefOr[String] = js.undefined
  
  /**
    * @description The execution scope of the vulnerable dependency.
    * @enum {string|null}
    */
  val scope: js.UndefOr[development | runtime | Null] = js.undefined
}
object Manifestpath {
  
  inline def apply(): Manifestpath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manifestpath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manifestpath] (val x: Self) extends AnyVal {
    
    inline def setManifest_path(value: String): Self = StObject.set(x, "manifest_path", value.asInstanceOf[js.Any])
    
    inline def setManifest_pathUndefined: Self = StObject.set(x, "manifest_path", js.undefined)
    
    inline def setScope(value: development | runtime): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def set_package(value: EcosystemName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
