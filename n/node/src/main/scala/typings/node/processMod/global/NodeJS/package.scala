package typings.node.processMod.global.NodeJS

import typings.node.nodeWorkerThreadsMod.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BeforeExitListener = js.Function1[/* code */ Double, Unit]

type DisconnectListener = js.Function0[Unit]

type ExitListener = js.Function1[/* code */ Double, Unit]

type MessageListener = js.Function2[/* message */ Any, /* sendHandle */ Any, Unit]

type MultipleResolveListener = js.Function3[/* type */ MultipleResolveType, /* promise */ js.Promise[Any], /* value */ Any, Unit]

// this namespace merge is here because these are specifically used
// as the type for process.stdin, process.stdout, and process.stderr.
// they can't live in tty.d.ts because we need to disambiguate the imported name.
type ReadStream = typings.node.nodeTtyMod.ReadStream

type RejectionHandledListener = js.Function1[/* promise */ js.Promise[Any], Unit]

type SignalsListener = js.Function1[/* signal */ Signals, Unit]

type UncaughtExceptionListener = js.Function2[/* error */ js.Error, /* origin */ UncaughtExceptionOrigin, Unit]

/**
  * Most of the time the unhandledRejection will be an Error, but this should not be relied upon
  * as *anything* can be thrown/rejected, it is therefore unsafe to assume that the value is an Error.
  */
type UnhandledRejectionListener = js.Function2[/* reason */ Any, /* promise */ js.Promise[Any], Unit]

type WarningListener = js.Function1[/* warning */ js.Error, Unit]

type WorkerListener = js.Function1[/* worker */ Worker, Unit]

type WriteStream = typings.node.nodeTtyMod.WriteStream
