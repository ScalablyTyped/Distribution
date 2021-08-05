package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typings.officeUiFabricReact.officeUiFabricReactStrings.initial
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typings.officeUiFabricReact.officeUiFabricReactStrings.unset
import typings.std.Extract
import typings.std.ReturnType
import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typings.uifabricFoundation.libIcomponentMod.IComponent
import typings.uifabricFoundation.libIcomponentMod.IStyleableComponentProps
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricFoundation.libIslotsMod.ISlotProp
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackItemTypesMod {
  
  type IStackItemComponent = IComponent[IStackItemProps, IStackItemTokens, IStackItemStyles, IStackItemProps, js.Object]
  
  trait IStackItemProps
    extends StObject
       with IStackItemSlots
       with IStyleableComponentProps[IStackItemProps, IStackItemTokens, IStackItemStyles] {
    
    /**
      * Defines how to align the StackItem along the x-axis (for vertical Stacks) or the y-axis (for horizontal Stacks).
      */
    var align: js.UndefOr[auto | stretch | baseline | start | center | end] = js.undefined
    
    /**
      * Defines whether the StackItem should be prevented from shrinking.
      * This can be used to prevent a StackItem from shrinking when it is inside of a Stack that has shrinking items.
      * @defaultvalue false
      */
    var disableShrink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines how much to grow the StackItem in proportion to its siblings.
      */
    var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.undefined
    
    /**
      * Defines order of the StackItem.
      * @defaultvalue 0
      */
    var order: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines at what ratio should the StackItem shrink to fit the available space.
      */
    var shrink: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.undefined
    
    /**
      * Defines whether the StackItem should take up 100% of the height of its parent.
      * @defaultvalue true
      */
    var verticalFill: js.UndefOr[Boolean] = js.undefined
  }
  object IStackItemProps {
    
    inline def apply(): IStackItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackItemProps]
    }
    
    extension [Self <: IStackItemProps](x: Self) {
      
      inline def setAlign(value: auto | stretch | baseline | start | center | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setDisableShrink(value: Boolean): Self = StObject.set(x, "disableShrink", value.asInstanceOf[js.Any])
      
      inline def setDisableShrinkUndefined: Self = StObject.set(x, "disableShrink", js.undefined)
      
      inline def setGrow(value: Boolean | Double | inherit | initial | unset): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      inline def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setShrink(value: Boolean | Double | inherit | initial | unset): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
      
      inline def setVerticalFill(value: Boolean): Self = StObject.set(x, "verticalFill", value.asInstanceOf[js.Any])
      
      inline def setVerticalFillUndefined: Self = StObject.set(x, "verticalFill", js.undefined)
    }
  }
  
  type IStackItemSlot = ISlotProp[IStackItemProps, scala.Nothing]
  
  trait IStackItemSlots extends StObject {
    
    var root: js.UndefOr[IHTMLSlot] = js.undefined
  }
  object IStackItemSlots {
    
    inline def apply(): IStackItemSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackItemSlots]
    }
    
    extension [Self <: IStackItemSlots](x: Self) {
      
      inline def setRoot(value: IHTMLSlot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/StackItem/StackItem.types.IStackItemSlots> */
  trait IStackItemStyles extends StObject {
    
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IStackItemStyles {
    
    inline def apply(): IStackItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackItemStyles]
    }
    
    extension [Self <: IStackItemStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type IStackItemStylesReturnType = ReturnType[
    Extract[
      IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles], 
      js.Function
    ]
  ]
  
  type IStackItemTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackItemProps, IStackItemTokens], js.Function]]
  
  trait IStackItemTokens extends StObject {
    
    /**
      * Defines the margin to be applied to the StackItem relative to its container.
      */
    var margin: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines the padding to be applied to the StackItem contents relative to its border.
      */
    var padding: js.UndefOr[Double | String] = js.undefined
  }
  object IStackItemTokens {
    
    inline def apply(): IStackItemTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackItemTokens]
    }
    
    extension [Self <: IStackItemTokens](x: Self) {
      
      inline def setMargin(value: Double | String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
