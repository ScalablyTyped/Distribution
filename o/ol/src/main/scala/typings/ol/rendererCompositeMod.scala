package typings.ol

import typings.ol.eventsMod.EventsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCompositeMod {
  
  /**
    * @classdesc
    * Canvas map renderer.
    * @api
    */
  @JSImport("ol/renderer/Composite", JSImport.Default)
  @js.native
  open class default () extends CompositeMapRenderer
  
  /**
    * @classdesc
    * Canvas map renderer.
    * @api
    */
  @js.native
  trait CompositeMapRenderer
    extends typings.ol.rendererMapMod.default {
    
    /**
      * @private
      * @type {Array<HTMLElement>}
      */
    /* private */ var children_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLDivElement}
      */
    /* private */ var element_ : Any = js.native
    
    /**
      * @type {import("../events.js").EventsKey}
      */
    var fontChangeListenerKey_ : EventsKey = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var renderedVisible_ : Any = js.native
  }
}
