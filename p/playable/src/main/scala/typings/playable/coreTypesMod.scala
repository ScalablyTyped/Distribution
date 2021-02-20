package typings.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreTypesMod {
  
  @js.native
  trait IStylable[TStyles] extends StObject {
    
    var styleNames: TStyles = js.native
  }
  object IStylable {
    
    @scala.inline
    def apply[TStyles](styleNames: TStyles): IStylable[TStyles] = {
      val __obj = js.Dynamic.literal(styleNames = styleNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStylable[TStyles]]
    }
    
    @scala.inline
    implicit class IStylableMutableBuilder[Self <: IStylable[_], TStyles] (val x: Self with IStylable[TStyles]) extends AnyVal {
      
      @scala.inline
      def setStyleNames(value: TStyles): Self = StObject.set(x, "styleNames", value.asInstanceOf[js.Any])
    }
  }
  
  type IStyles = StringDictionary[String]
  
  type IView[TStyles] = IStylable[TStyles]
}
