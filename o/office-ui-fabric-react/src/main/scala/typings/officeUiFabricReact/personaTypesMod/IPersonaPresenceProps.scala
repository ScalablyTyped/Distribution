package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
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
  
  @scala.inline
  def apply(): IPersonaPresenceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaPresenceProps]
  }
  
  @scala.inline
  implicit class IPersonaPresencePropsMutableBuilder[Self <: IPersonaPresenceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IPersonaPresenceStyleProps, IPersonaPresenceStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IPersonaPresenceStyleProps => DeepPartial[IPersonaPresenceStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
