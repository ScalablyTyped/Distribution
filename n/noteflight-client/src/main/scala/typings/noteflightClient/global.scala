package typings.noteflightClient

import org.scalablytyped.runtime.Instantiable3
import typings.noteflightClient.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object NFClient {
    
    @JSGlobal("NFClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * To replace an element with a Noteflight embedded document, use the API to create a new NFClient.ScoreView object,
      * passing the element ID of the score and a special options object that describes the score to be created.
      * @param elementID - The ID of the HTML element that will be replaced by the embedded score.
      * @param noteflightID - the ID of the noteflight score. This ID is displayed at the end of a noteflight score URL.
      * @param options - An object specificing the options of the embedded score.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("NFClient.ScoreView")
    @js.native
    open class ScoreView protected ()
      extends StObject
         with typings.noteflightClient.ScoreView {
      def this(elementID: String, noteflightID: String, options: Options) = this()
    }
    /**
      * To replace an element with a Noteflight embedded document, use the API to create a new NFClient.ScoreView object,
      * passing the element ID of the score and a special options object that describes the score to be created.
      * @param elementID - The ID of the HTML element that will be replaced by the embedded score.
      * @param noteflightID - the ID of the noteflight score. This ID is displayed at the end of a noteflight score URL.
      * @param options - An object specificing the options of the embedded score.
      */
    @JSGlobal("NFClient.ScoreView")
    @js.native
    def ScoreView: Instantiable3[
        /* elementID */ String, 
        /* noteflightID */ String, 
        /* options */ Options, 
        typings.noteflightClient.ScoreView
      ] = js.native
    inline def ScoreView_=(
      x: Instantiable3[
          /* elementID */ String, 
          /* noteflightID */ String, 
          /* options */ Options, 
          typings.noteflightClient.ScoreView
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScoreView")(x.asInstanceOf[js.Any])
    
    /**
      * The init() function performs additional API initialization and then invokes an optional callback function that is passed to it.
      * The callback function, when called, is in turn passed an object that describes the API's properties and capabilities.
      */
    inline def init(callback: js.Function1[/* info */ Version, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
