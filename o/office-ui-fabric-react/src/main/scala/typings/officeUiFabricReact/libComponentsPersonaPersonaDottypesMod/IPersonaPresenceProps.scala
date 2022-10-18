package typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod

import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaPresenceProps
  extends StObject
     with IPersonaSharedProps {
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaPresenceStyleProps, IPersonaPresenceStyles]] = js.undefined
}
object IPersonaPresenceProps {
  
  inline def apply(): IPersonaPresenceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaPresenceProps]
  }
  
  extension [Self <: IPersonaPresenceProps](x: Self) {
    
    inline def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IPersonaPresenceStyleProps, IPersonaPresenceStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IPersonaPresenceStyleProps => DeepPartial[IPersonaPresenceStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
