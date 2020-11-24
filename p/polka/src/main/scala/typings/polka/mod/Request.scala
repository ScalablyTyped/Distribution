package typings.polka.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `http.IncomingMessage`, extended by Polka
  */
@js.native
trait Request extends IncomingMessage {
  
  /**
    * The originally-requested URL, including parent router segments.
    */
  var originalUrl: String = js.native
  
  /**
    * The values of named parameters within your route pattern
    */
  var params: StringDictionary[String] = js.native
  
  /**
    * The path portion of the requested URL.
    */
  var path: String = js.native
  
  /**
    * The parsed querystring
    */
  var query: StringDictionary[String | js.Array[String]] = js.native
  
  /**
    * The un-parsed querystring
    */
  var search: String | Null = js.native
}
