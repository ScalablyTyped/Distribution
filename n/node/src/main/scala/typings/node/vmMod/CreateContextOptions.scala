package typings.node.vmMod

import typings.node.anon.Strings
import typings.node.nodeStrings.afterEvaluate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContextOptions extends StObject {
  
  var codeGeneration: js.UndefOr[Strings] = js.undefined
  
  /**
    * If set to `afterEvaluate`, microtasks will be run immediately after the script has run.
    */
  var microtaskMode: js.UndefOr[afterEvaluate] = js.undefined
  
  /**
    * Human-readable name of the newly created context.
    * @default 'VM Context i' Where i is an ascending numerical index of the created context.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the newly created context for display purposes.
    * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
    * like the value of the `url.origin` property of a URL object.
    * Most notably, this string should omit the trailing slash, as that denotes a path.
    * @default ''
    */
  var origin: js.UndefOr[String] = js.undefined
}
object CreateContextOptions {
  
  inline def apply(): CreateContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContextOptions] (val x: Self) extends AnyVal {
    
    inline def setCodeGeneration(value: Strings): Self = StObject.set(x, "codeGeneration", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationUndefined: Self = StObject.set(x, "codeGeneration", js.undefined)
    
    inline def setMicrotaskMode(value: afterEvaluate): Self = StObject.set(x, "microtaskMode", value.asInstanceOf[js.Any])
    
    inline def setMicrotaskModeUndefined: Self = StObject.set(x, "microtaskMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
