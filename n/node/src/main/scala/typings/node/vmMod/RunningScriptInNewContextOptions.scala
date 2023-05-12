package typings.node.vmMod

import typings.node.anon.Strings
import typings.node.nodeStrings.afterEvaluate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunningScriptInNewContextOptions
  extends StObject
     with RunningScriptOptions {
  
  var contextCodeGeneration: js.UndefOr[Strings] = js.undefined
  
  /**
    * Human-readable name of the newly created context.
    */
  var contextName: js.UndefOr[String] = js.undefined
  
  /**
    * Origin corresponding to the newly created context for display purposes. The origin should be formatted like a URL,
    * but with only the scheme, host, and port (if necessary), like the value of the `url.origin` property of a `URL` object.
    * Most notably, this string should omit the trailing slash, as that denotes a path.
    */
  var contextOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * If set to `afterEvaluate`, microtasks will be run immediately after the script has run.
    */
  var microtaskMode: js.UndefOr[afterEvaluate] = js.undefined
}
object RunningScriptInNewContextOptions {
  
  inline def apply(): RunningScriptInNewContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunningScriptInNewContextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunningScriptInNewContextOptions] (val x: Self) extends AnyVal {
    
    inline def setContextCodeGeneration(value: Strings): Self = StObject.set(x, "contextCodeGeneration", value.asInstanceOf[js.Any])
    
    inline def setContextCodeGenerationUndefined: Self = StObject.set(x, "contextCodeGeneration", js.undefined)
    
    inline def setContextName(value: String): Self = StObject.set(x, "contextName", value.asInstanceOf[js.Any])
    
    inline def setContextNameUndefined: Self = StObject.set(x, "contextName", js.undefined)
    
    inline def setContextOrigin(value: String): Self = StObject.set(x, "contextOrigin", value.asInstanceOf[js.Any])
    
    inline def setContextOriginUndefined: Self = StObject.set(x, "contextOrigin", js.undefined)
    
    inline def setMicrotaskMode(value: afterEvaluate): Self = StObject.set(x, "microtaskMode", value.asInstanceOf[js.Any])
    
    inline def setMicrotaskModeUndefined: Self = StObject.set(x, "microtaskMode", js.undefined)
  }
}
