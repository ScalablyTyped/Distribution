package typings.mobx

import typings.mobx.distCoreComputedvalueMod.ComputedValue
import typings.mobx.distCoreDerivationMod.IDerivation
import typings.mobx.distCoreObservableMod.IObservable
import typings.mobx.distInternalMod.Reaction_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreGlobalstateMod {
  
  @JSImport("mobx/dist/core/globalstate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/core/globalstate", "MobXGlobals")
  @js.native
  open class MobXGlobals () extends StObject {
    
    /**
      * globally unique token to signal unchanged
      */
    var UNCHANGED: IUNCHANGED = js.native
    
    /**
      * Is it allowed to change observables at this point?
      * In general, MobX doesn't allow that when running computations and React.render.
      * To ensure that those functions stay pure.
      */
    var allowStateChanges: Boolean = js.native
    
    /**
      * Is it allowed to read observables at this point?
      * Used to hold the state needed for `observableRequiresReaction`
      */
    var allowStateReads: Boolean = js.native
    
    /**
      * Warn if computed values are accessed outside a reactive context
      */
    var computedRequiresReaction: Boolean = js.native
    
    var disableErrorBoundaries: Boolean = js.native
    
    /**
      * If strict mode is enabled, state changes are by default not allowed
      */
    var enforceActions: Boolean | "always" = js.native
    
    /**
      * Globally attached error handlers that react specifically to errors in reactions
      */
    var globalReactionErrorHandlers: js.Array[js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit]] = js.native
    
    /**
      * Are we in a batch block? (and how many of them)
      */
    var inBatch: Double = js.native
    
    /**
      * Are we currently processing reactions?
      */
    var isRunningReactions: Boolean = js.native
    
    /**
      * 'guid' for general purpose. Will be persisted amongst resets.
      */
    var mobxGuid: Double = js.native
    
    /**
      * (Experimental)
      * Warn if observables are accessed outside a reactive context
      */
    var observableRequiresReaction: Boolean = js.native
    
    /**
      * List of scheduled, not yet executed, reactions.
      */
    var pendingReactions: js.Array[Reaction_] = js.native
    
    /**
      * Observables that don't have observers anymore, and are about to be
      * suspended, unless somebody else accesses it in the same batch
      *
      * @type {IObservable[]}
      */
    var pendingUnobservations: js.Array[IObservable] = js.native
    
    /**
      * (Experimental)
      * Warn if you try to create to derivation / reactive context without accessing any observable.
      */
    var reactionRequiresObservable: Boolean = js.native
    
    /**
      * Each time a derivation is tracked, it is assigned a unique run-id
      */
    var runId: Double = js.native
    
    /**
      * False forces all object's descriptors to
      * writable: true
      * configurable: true
      */
    var safeDescriptors: Boolean = js.native
    
    /**
      * Spy callbacks
      */
    var spyListeners: js.Array[js.Function1[/* change */ Any, Unit]] = js.native
    
    var suppressReactionErrors: Boolean = js.native
    
    /**
      * Currently running reaction. This determines if we currently have a reactive context.
      * (Tracking derivation is also set for temporal tracking of computed values inside actions,
      * but trackingReaction can only be set by a form of Reaction)
      */
    var trackingContext: Reaction_ | ComputedValue[Any] | Null = js.native
    
    /**
      * Currently running derivation
      */
    var trackingDerivation: IDerivation | Null = js.native
    
    var useProxies: Boolean = js.native
    
    var verifyProxies: Boolean = js.native
    
    /**
      * MobXGlobals version.
      * MobX compatiblity with other versions loaded in memory as long as this version matches.
      * It indicates that the global state still stores similar information
      *
      * N.B: this version is unrelated to the package version of MobX, and is only the version of the
      * internal state storage of MobX, and can be the same across many different package versions
      */
    var version: Double = js.native
  }
  
  inline def getGlobalState(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalState")().asInstanceOf[Any]
  
  @JSImport("mobx/dist/core/globalstate", "globalState")
  @js.native
  def globalState: MobXGlobals = js.native
  inline def globalState_=(x: MobXGlobals): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalState")(x.asInstanceOf[js.Any])
  
  inline def isolateGlobalState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isolateGlobalState")().asInstanceOf[Unit]
  
  inline def resetGlobalState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalState")().asInstanceOf[Unit]
  
  type IUNCHANGED = js.Object
}
