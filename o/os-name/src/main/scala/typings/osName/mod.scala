package typings.osName

import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get the name of the current operating system.
  By default, the name of the current operating system is returned.
  @param platform - Custom platform name.
  @param release - Custom release name.
  @example
  ```
  import * as os fron 'os';
  import osName = require('os-name');
  // On a macOS Sierra system
  osName();
  //=> 'macOS Sierra'
  osName(os.platform(), os.release());
  //=> 'macOS Sierra'
  osName('darwin', '14.0.0');
  //=> 'OS X Yosemite'
  osName('linux', '3.13.0-24-generic');
  //=> 'Linux 3.13'
  osName('win32', '6.3.9600');
  //=> 'Windows 8.1'
  ```
  */
  @JSImport("os-name", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("os-name", JSImport.Namespace)
  @js.native
  def apply(platform: Platform, release: String): String = js.native
}
