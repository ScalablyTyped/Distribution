package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Game
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BootCallback = js.Function1[/* game */ Game, Unit]

/**
  * This callback type is completely empty, a no-operation.
  */
type NOOP = js.Function0[Unit]

type TimeStepCallback = js.Function2[/* time */ Double, /* average */ Double, Unit]
