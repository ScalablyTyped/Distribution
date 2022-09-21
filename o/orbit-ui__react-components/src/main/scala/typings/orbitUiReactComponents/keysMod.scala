package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keysMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Keys extends StObject
  @JSImport("@orbit-ui/react-components/dist/shared/src/keys", "Keys")
  @js.native
  object Keys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Keys & String] = js.native
    
    @js.native
    sealed trait arrowDown
      extends StObject
         with Keys
    /* "ArrowDown" */ val arrowDown: typings.orbitUiReactComponents.keysMod.Keys.arrowDown & String = js.native
    
    @js.native
    sealed trait arrowLeft
      extends StObject
         with Keys
    /* "ArrowLeft" */ val arrowLeft: typings.orbitUiReactComponents.keysMod.Keys.arrowLeft & String = js.native
    
    @js.native
    sealed trait arrowRight
      extends StObject
         with Keys
    /* "ArrowRight" */ val arrowRight: typings.orbitUiReactComponents.keysMod.Keys.arrowRight & String = js.native
    
    @js.native
    sealed trait arrowUp
      extends StObject
         with Keys
    /* "ArrowUp" */ val arrowUp: typings.orbitUiReactComponents.keysMod.Keys.arrowUp & String = js.native
    
    @js.native
    sealed trait backspace
      extends StObject
         with Keys
    /* "Backspace" */ val backspace: typings.orbitUiReactComponents.keysMod.Keys.backspace & String = js.native
    
    @js.native
    sealed trait delete
      extends StObject
         with Keys
    /* "Delete" */ val delete: typings.orbitUiReactComponents.keysMod.Keys.delete & String = js.native
    
    @js.native
    sealed trait end
      extends StObject
         with Keys
    /* "End" */ val end: typings.orbitUiReactComponents.keysMod.Keys.end & String = js.native
    
    @js.native
    sealed trait enter
      extends StObject
         with Keys
    /* "Enter" */ val enter: typings.orbitUiReactComponents.keysMod.Keys.enter & String = js.native
    
    @js.native
    sealed trait esc
      extends StObject
         with Keys
    /* "Escape" */ val esc: typings.orbitUiReactComponents.keysMod.Keys.esc & String = js.native
    
    @js.native
    sealed trait home
      extends StObject
         with Keys
    /* "Home" */ val home: typings.orbitUiReactComponents.keysMod.Keys.home & String = js.native
    
    @js.native
    sealed trait space
      extends StObject
         with Keys
    /* " " */ val space: typings.orbitUiReactComponents.keysMod.Keys.space & String = js.native
    
    @js.native
    sealed trait tab
      extends StObject
         with Keys
    /* "Tab" */ val tab: typings.orbitUiReactComponents.keysMod.Keys.tab & String = js.native
  }
  
  inline def appendEventKey(str: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendEventKey")(str.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
}
