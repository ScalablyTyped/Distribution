package typings.phaser.mod

import typings.phaser.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * This setting will auto-detect if the browser is capable of suppporting WebGL.
  * If it is, it will use the WebGL Renderer. If not, it will fall back to the Canvas Renderer.
  */
inline def AUTO: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("AUTO").asInstanceOf[Double]

/**
  * Forces Phaser to only use the Canvas Renderer, regardless if the browser supports
  * WebGL or not.
  */
inline def CANVAS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CANVAS").asInstanceOf[Double]

/**
  * Direction constant.
  */
inline def DOWN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DOWN").asInstanceOf[Double]

/**
  * In Phaser the value -1 means 'forever' in lots of cases, this const allows you to use it instead
  * to help you remember what the value is doing in your code.
  */
inline def FOREVER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FOREVER").asInstanceOf[Double]

/**
  * A Headless Renderer doesn't create either a Canvas or WebGL Renderer. However, it still
  * absolutely relies on the DOM being present and available. This mode is meant for unit testing,
  * not for running Phaser on the server, which is something you really shouldn't do.
  */
inline def HEADLESS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("HEADLESS").asInstanceOf[Double]

/**
  * Direction constant.
  */
inline def LEFT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LEFT").asInstanceOf[Double]

/**
  * Direction constant.
  */
inline def NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("NONE").asInstanceOf[Double]

/**
  * Direction constant.
  */
inline def RIGHT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGHT").asInstanceOf[Double]

/**
  * Direction constant.
  */
inline def UP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("UP").asInstanceOf[Double]

/**
  * Phaser Release Version
  */
inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

/**
  * Forces Phaser to use the WebGL Renderer. If the browser does not support it, there is
  * no fallback to Canvas with this setting, so you should trap it and display a suitable
  * message to the user.
  */
inline def WEBGL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("WEBGL").asInstanceOf[Double]
