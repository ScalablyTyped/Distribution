package typings.officeUiFabricReact

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beakTypesMod {
  
  @js.native
  trait IBeak extends StObject
  
  @js.native
  trait IBeakProps extends IBaseProps[IBeak] {
    
    /**
      * Bottom position of the beak
      */
    var bottom: js.UndefOr[String] = js.native
    
    /**
      * Color of the beak
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Direction of beak
      */
    var direction: js.UndefOr[RectangleEdge] = js.native
    
    /**
      * Beak height.
      * @defaultvalue 18
      * @deprecated Do not use.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Left position of the beak
      */
    var left: js.UndefOr[String] = js.native
    
    /**
      * Right position of the beak
      */
    var right: js.UndefOr[String] = js.native
    
    /**
      * Top position of the beak
      */
    var top: js.UndefOr[String] = js.native
    
    /**
      * Beak width.
      * @defaultvalue 18
      * @deprecated Do not use.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IBeakProps {
    
    @scala.inline
    def apply(): IBeakProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBeakProps]
    }
    
    @scala.inline
    implicit class IBeakPropsMutableBuilder[Self <: IBeakProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDirection(value: RectangleEdge): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IBeakStylesProps extends StObject {
    
    var bottom: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[String] = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object IBeakStylesProps {
    
    @scala.inline
    def apply(): IBeakStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBeakStylesProps]
    }
    
    @scala.inline
    implicit class IBeakStylesPropsMutableBuilder[Self <: IBeakStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
