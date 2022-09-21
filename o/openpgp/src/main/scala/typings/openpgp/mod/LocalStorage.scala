package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "LocalStorage")
@js.native
/**
  * This object is used for storing and retrieving configuration from HTML5 local storage.
  */
open class LocalStorage () extends StObject {
  
  /**
    * Reads the config out of the HTML5 local storage
    * and initializes the object config.
    * if config is null the default config will be used
    */
  def read(): Unit = js.native
  
  /**
    * Writes the config to HTML5 local storage
    */
  def write(): Unit = js.native
}
