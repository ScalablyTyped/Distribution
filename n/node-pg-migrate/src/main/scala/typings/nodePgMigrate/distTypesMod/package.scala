package typings.nodePgMigrate.distTypesMod

import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Literal = js.Function1[/* v */ Name, String]

type LogFn = js.Function1[/* msg */ String, Unit]

type MigrationAction = js.Function2[
/* pgm */ MigrationBuilder, 
/* run */ js.UndefOr[js.Function0[Unit]], 
js.Promise[Unit] | Unit]

type RunnerOption = (RunnerOptionClient & RunnerOptionConfig) | (RunnerOptionUrl & RunnerOptionConfig)
