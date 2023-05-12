package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.WindowInstance.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowInstance extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.WindowInstance")
  @js.native
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.WindowInstance {
    
    /* CompleteClass */
    var closed: Promise[Unit, Any, Any] = js.native
    
    /* CompleteClass */
    var closing: Promise[Unit, Any, Any] = js.native
    
    /**
      * Check if window is closed.
      *
      * @return Window is closed
      */
    /* CompleteClass */
    override def isClosed(): Boolean = js.native
    
    /**
      * Check if window is closing.
      *
      * @return Window is closing
      */
    /* CompleteClass */
    override def isClosing(): Boolean = js.native
    
    /**
      * Check if window is opened.
      *
      * @return Window is opened
      */
    /* CompleteClass */
    override def isOpened(): Boolean = js.native
    
    /**
      * Check if window is opening.
      *
      * @return Window is opening
      */
    /* CompleteClass */
    override def isOpening(): Boolean = js.native
    
    /* CompleteClass */
    var opened: Promise[Unit, Any, Any] = js.native
    
    /* CompleteClass */
    var opening: Promise[Unit, Any, Any] = js.native
  }
  
  @JSGlobal("OO.ui.WindowInstance")
  @js.native
  val ^ : Constructor = js.native
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `WindowInstance.foo` */
  override def _to: Constructor = ^
}
