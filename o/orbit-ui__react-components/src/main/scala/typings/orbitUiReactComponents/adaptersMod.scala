package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.AlignItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/adapters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFlexAlignment(orientation: Orientation, align: Alignment, verticalAlign: Alignment): AlignItems = (^.asInstanceOf[js.Dynamic].applyDynamic("useFlexAlignment")(orientation.asInstanceOf[js.Any], align.asInstanceOf[js.Any], verticalAlign.asInstanceOf[js.Any])).asInstanceOf[AlignItems]
  
  inline def useFlexDirection(orientation: Orientation): typings.orbitUiReactComponents.anon.Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlexDirection")(orientation.asInstanceOf[js.Any]).asInstanceOf[typings.orbitUiReactComponents.anon.Direction]
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.center
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.center = "center".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.center]
    
    inline def end: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end = "end".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end]
    
    inline def start: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start = "start".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.row
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.column
  */
  trait Direction extends StObject
  object Direction {
    
    inline def column: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.column = "column".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.column]
    
    inline def row: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.row = "row".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal = "horizontal".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal]
    
    inline def vertical: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical = "vertical".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical]
  }
}
