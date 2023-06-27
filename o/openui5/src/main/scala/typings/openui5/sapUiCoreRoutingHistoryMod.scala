package typings.openui5

import typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingHistoryMod {
  
  @JSImport("sap/ui/core/routing/History", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with History {
    /**
      * Used to determine the {@link sap.ui.core.routing.HistoryDirection} of the current or a future navigation,
      * done with a {@link sap.ui.core.routing.Router} or {@link sap.ui.core.routing.HashChanger}.
      *
      * **ATTENTION:** this class will not be accurate if someone does hash-replacement without the named classes
      * above. If you are manipulating the hash directly, this class is not supported anymore.
      */
    def this(/**
      * required, without a HashChanger this class cannot work. The class needs to be aware of the hash-changes.
      */
    oHashChanger: typings.openui5.sapUiCoreRoutingHashChangerMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/History", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
      */
    inline def getInstance(): History = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[History]
  }
  
  @js.native
  trait History extends StObject {
    
    /**
      * Determines what the navigation direction for a newly given hash would be It will say Unknown if there
      * is a history foo - bar (current history) - foo If you now ask for the direction of the hash "foo" you
      * get Unknown because it might be backwards or forwards. For hash replacements, the history stack will
      * be replaced at this position for the history.
      *
      * @returns Direction for the given hash or `undefined`, if no navigation has taken place yet.
      */
    def getDirection(): js.UndefOr[
        HistoryDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof routing.HistoryDirection * / any */ String)
      ] = js.native
    def getDirection(
      /**
      * optional, if this parameter is not passed the last hashChange is taken.
      */
    sNewHash: String
    ): js.UndefOr[
        HistoryDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof routing.HistoryDirection * / any */ String)
      ] = js.native
    
    /**
      * @since 1.70
      *
      * Returns the length difference between the history state stored in browser's pushState and the state maintained
      * in this class.
      *
      * The function returns `undefined` when
      * 	 - The current state in browser's history pushState isn't initialized, for example, between a new hash
      *     is set or replaced and the "hashChange" event is processed by this class
      * 	 - History pushState is already used before UI5 History is initialized, and UI5 can't maintain the hash
      *     history by using the browser pushState
      *
      * Once the "hashChange" event is processed by this class, this method always returns 0. However, before
      * a "hashChange" event reaches this class, it returns the offset between the new hash and the previous
      * one within the history state.
      *
      * @returns The length difference or returns `undefined` when browser pushState can't be used at the moment
      * when this function is called
      */
    def getHistoryStateOffset(): js.UndefOr[int] = js.native
    
    /**
      * Gets the previous hash in the history.
      *
      * If the last direction was Unknown or there was no navigation yet, `undefined` will be returned.
      *
      * @returns Previous hash in the history or `undefined`
      */
    def getPreviousHash(): js.UndefOr[String] = js.native
  }
}
