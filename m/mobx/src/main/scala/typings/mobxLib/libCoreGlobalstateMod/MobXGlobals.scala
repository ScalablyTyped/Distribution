package typings
package mobxLib.libCoreGlobalstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/globalstate", "MobXGlobals")
@js.native
class MobXGlobals () extends js.Object {
  /**
       * Is it allowed to change observables at this point?
       * In general, MobX doesn't allow that when running computations and React.render.
       * To ensure that those functions stay pure.
       */
  var allowStateChanges: scala.Boolean = js.native
  /**
       * Are we running a computation currently? (not a reaction)
       */
  var computationDepth: scala.Double = js.native
  /**
       * Warn if computed values are accessed outside a reactive context
       */
  var computedRequiresReaction: scala.Boolean = js.native
  var disableErrorBoundaries: scala.Boolean = js.native
  /**
       * If strict mode is enabled, state changes are by default not allowed
       */
  var enforceActions: scala.Boolean | mobxLib.mobxLibStrings.strict = js.native
  /**
       * Globally attached error handlers that react specifically to errors in reactions
       */
  var globalReactionErrorHandlers: js.Array[
    js.Function2[/* error */ _, /* derivation */ mobxLib.libCoreDerivationMod.IDerivation, scala.Unit]
  ] = js.native
  /**
       * Are we in a batch block? (and how many of them)
       */
  var inBatch: scala.Double = js.native
  /**
       * Are we currently processing reactions?
       */
  var isRunningReactions: scala.Boolean = js.native
  /**
       * 'guid' for general purpose. Will be persisted amongst resets.
       */
  var mobxGuid: scala.Double = js.native
  /**
       * List of scheduled, not yet executed, reactions.
       */
  var pendingReactions: js.Array[mobxLib.libInternalMod.Reaction] = js.native
  /**
       * Observables that don't have observers anymore, and are about to be
       * suspended, unless somebody else accesses it in the same batch
       *
       * @type {IObservable[]}
       */
  var pendingUnobservations: js.Array[mobxLib.libCoreObservableMod.IObservable] = js.native
  /**
       * Each time a derivation is tracked, it is assigned a unique run-id
       */
  var runId: scala.Double = js.native
  /**
       * Spy callbacks
       */
  var spyListeners: js.Array[mobxLib.Anon_Change] = js.native
  /**
       * Currently running derivation
       */
  var trackingDerivation: mobxLib.libCoreDerivationMod.IDerivation | scala.Null = js.native
  /**
       * MobXGlobals version.
       * MobX compatiblity with other versions loaded in memory as long as this version matches.
       * It indicates that the global state still stores similar information
       *
       * N.B: this version is unrelated to the package version of MobX, and is only the version of the
       * internal state storage of MobX, and can be the same across many different package versions
       */
  var version: scala.Double = js.native
}

