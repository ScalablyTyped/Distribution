package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SignatureMethod expects an accessor object to be like this:
  *   {tokenSecret: "lakjsdflkj...", consumerSecret: "QOUEWRI..", accessorSecret: "xcmvzc..."}
  * The accessorSecret property is optional.
  */
trait Accessor extends js.Object {
  var accessorSecret: js.UndefOr[java.lang.String] = js.undefined
  var consumerKey: java.lang.String
  var consumerSecret: java.lang.String
  var token: java.lang.String
  var tokenSecret: java.lang.String
}

