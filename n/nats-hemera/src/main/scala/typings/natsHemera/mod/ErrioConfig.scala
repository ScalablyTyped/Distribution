package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrioConfig extends StObject {
  
  var exclude: js.UndefOr[js.Any] = js.undefined
  
  var include: js.UndefOr[js.Any] = js.undefined
  
  var inherited: js.UndefOr[Boolean] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var stack: js.UndefOr[Boolean] = js.undefined
}
object ErrioConfig {
  
  @scala.inline
  def apply(): ErrioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrioConfig]
  }
  
  @scala.inline
  implicit class ErrioConfigMutableBuilder[Self <: ErrioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Any): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: js.Any): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
