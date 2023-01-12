package typings.parcelPackageManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Range extends StObject {
    
    var range: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SemverRange */ Any) | Null
      ] = js.undefined
    
    var saveDev: js.UndefOr[Boolean] = js.undefined
    
    var shouldAutoInstall: js.UndefOr[Boolean] = js.undefined
  }
  object Range {
    
    inline def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      inline def setRange(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SemverRange */ Any
      ): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeNull: Self = StObject.set(x, "range", null)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSaveDev(value: Boolean): Self = StObject.set(x, "saveDev", value.asInstanceOf[js.Any])
      
      inline def setSaveDevUndefined: Self = StObject.set(x, "saveDev", js.undefined)
      
      inline def setShouldAutoInstall(value: Boolean): Self = StObject.set(x, "shouldAutoInstall", value.asInstanceOf[js.Any])
      
      inline def setShouldAutoInstallUndefined: Self = StObject.set(x, "shouldAutoInstall", js.undefined)
    }
  }
}
