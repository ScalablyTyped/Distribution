package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.WindowInstance.Props
import typings.oojsUi.OO.ui.WindowInstance.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A window instance represents the life cycle for one single opening of a window
  * until its closing.
  *
  * While OO.ui.WindowManager will reuse OO.ui.Window objects, each time a window is
  * opened, a new lifecycle starts.
  *
  * For more information, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows).
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.WindowInstance
  */
trait WindowInstance
  extends StObject
     with Props
     with Prototype
object WindowInstance {
  
  inline def apply(
    closed: Promise[Unit, Any, Any],
    closing: Promise[Unit, Any, Any],
    isClosed: () => Boolean,
    isClosing: () => Boolean,
    isOpened: () => Boolean,
    isOpening: () => Boolean,
    opened: Promise[Unit, Any, Any],
    opening: Promise[Unit, Any, Any]
  ): WindowInstance = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], isClosed = js.Any.fromFunction0(isClosed), isClosing = js.Any.fromFunction0(isClosing), isOpened = js.Any.fromFunction0(isOpened), isOpening = js.Any.fromFunction0(isOpening), opened = opened.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowInstance]
  }
  
  @js.native
  trait Constructor
    extends StObject
       with Instantiable0[WindowInstance]
  
  trait Props extends StObject {
    
    var closed: Promise[Unit, Any, Any]
    
    var closing: Promise[Unit, Any, Any]
    
    var opened: Promise[Unit, Any, Any]
    
    var opening: Promise[Unit, Any, Any]
  }
  object Props {
    
    inline def apply(
      closed: Promise[Unit, Any, Any],
      closing: Promise[Unit, Any, Any],
      opened: Promise[Unit, Any, Any],
      opening: Promise[Unit, Any, Any]
    ): Props = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setClosed(value: Promise[Unit, Any, Any]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosing(value: Promise[Unit, Any, Any]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setOpened(value: Promise[Unit, Any, Any]): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      inline def setOpening(value: Promise[Unit, Any, Any]): Self = StObject.set(x, "opening", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prototype extends StObject {
    
    /**
      * Check if window is closed.
      *
      * @return Window is closed
      */
    def isClosed(): Boolean
    
    /**
      * Check if window is closing.
      *
      * @return Window is closing
      */
    def isClosing(): Boolean
    
    /**
      * Check if window is opened.
      *
      * @return Window is opened
      */
    def isOpened(): Boolean
    
    /**
      * Check if window is opening.
      *
      * @return Window is opening
      */
    def isOpening(): Boolean
  }
  object Prototype {
    
    inline def apply(
      isClosed: () => Boolean,
      isClosing: () => Boolean,
      isOpened: () => Boolean,
      isOpening: () => Boolean
    ): Prototype = {
      val __obj = js.Dynamic.literal(isClosed = js.Any.fromFunction0(isClosed), isClosing = js.Any.fromFunction0(isClosing), isOpened = js.Any.fromFunction0(isOpened), isOpening = js.Any.fromFunction0(isOpening))
      __obj.asInstanceOf[Prototype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prototype] (val x: Self) extends AnyVal {
      
      inline def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
      
      inline def setIsClosing(value: () => Boolean): Self = StObject.set(x, "isClosing", js.Any.fromFunction0(value))
      
      inline def setIsOpened(value: () => Boolean): Self = StObject.set(x, "isOpened", js.Any.fromFunction0(value))
      
      inline def setIsOpening(value: () => Boolean): Self = StObject.set(x, "isOpening", js.Any.fromFunction0(value))
    }
  }
}
