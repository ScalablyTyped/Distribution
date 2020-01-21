package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.httpOnly
  - typings.microsoftGraph.microsoftGraphStrings.httpWithPeeringNat
  - typings.microsoftGraph.microsoftGraphStrings.httpWithPeeringPrivateGroup
  - typings.microsoftGraph.microsoftGraphStrings.httpWithInternetPeering
  - typings.microsoftGraph.microsoftGraphStrings.simpleDownload
  - typings.microsoftGraph.microsoftGraphStrings.bypassMode
*/
trait WindowsDeliveryOptimizationMode extends js.Object

object WindowsDeliveryOptimizationMode {
  @scala.inline
  def bypassMode: typings.microsoftGraph.microsoftGraphStrings.bypassMode = this.cast("bypassMode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def httpOnly: typings.microsoftGraph.microsoftGraphStrings.httpOnly = this.cast("httpOnly")
  @scala.inline
  def httpWithInternetPeering: typings.microsoftGraph.microsoftGraphStrings.httpWithInternetPeering = this.cast("httpWithInternetPeering")
  @scala.inline
  def httpWithPeeringNat: typings.microsoftGraph.microsoftGraphStrings.httpWithPeeringNat = this.cast("httpWithPeeringNat")
  @scala.inline
  def httpWithPeeringPrivateGroup: typings.microsoftGraph.microsoftGraphStrings.httpWithPeeringPrivateGroup = this.cast("httpWithPeeringPrivateGroup")
  @scala.inline
  def simpleDownload: typings.microsoftGraph.microsoftGraphStrings.simpleDownload = this.cast("simpleDownload")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

