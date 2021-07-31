package typings.officeUiFabricReact

import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningContainerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getClassNames(): IPositioningContainerNames = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")().asInstanceOf[IPositioningContainerNames]
  
  trait IPositioningContainerNames extends StObject {
    
    var beak: js.UndefOr[String] = js.undefined
    
    var beakCurtain: js.UndefOr[String] = js.undefined
    
    var container: String
    
    var main: String
    
    var overFlowYHidden: String
    
    /**
      * Root html container for this component.
      */
    var root: String
  }
  object IPositioningContainerNames {
    
    @scala.inline
    def apply(container: String, main: String, overFlowYHidden: String, root: String): IPositioningContainerNames = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], overFlowYHidden = overFlowYHidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositioningContainerNames]
    }
    
    @scala.inline
    implicit class IPositioningContainerNamesMutableBuilder[Self <: IPositioningContainerNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeak(value: String): Self = StObject.set(x, "beak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakCurtain(value: String): Self = StObject.set(x, "beakCurtain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakCurtainUndefined: Self = StObject.set(x, "beakCurtain", js.undefined)
      
      @scala.inline
      def setBeakUndefined: Self = StObject.set(x, "beak", js.undefined)
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverFlowYHidden(value: String): Self = StObject.set(x, "overFlowYHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPositioningContainerStyles extends StObject {
    
    /**
      * Style for the root element in the default enabled/unchecked state.
      */
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IPositioningContainerStyles {
    
    @scala.inline
    def apply(): IPositioningContainerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPositioningContainerStyles]
    }
    
    @scala.inline
    implicit class IPositioningContainerStylesMutableBuilder[Self <: IPositioningContainerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
