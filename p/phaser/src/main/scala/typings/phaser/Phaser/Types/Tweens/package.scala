package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.Tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A Tween Event.
  */
type Event = String

type GetActiveCallback = js.Function6[
/* target */ Any, 
/* key */ String, 
/* value */ Double, 
/* targetIndex */ Double, 
/* totalTargets */ Double, 
/* tween */ Tween, 
Double]

type GetEndCallback = js.Function6[
/* target */ Any, 
/* key */ String, 
/* value */ Double, 
/* targetIndex */ Double, 
/* totalTargets */ Double, 
/* tween */ Tween, 
Double]

type GetStartCallback = js.Function6[
/* target */ Any, 
/* key */ String, 
/* value */ Double, 
/* targetIndex */ Double, 
/* totalTargets */ Double, 
/* tween */ Tween, 
Double]
