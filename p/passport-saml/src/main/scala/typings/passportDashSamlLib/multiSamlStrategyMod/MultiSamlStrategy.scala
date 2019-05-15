package typings
package passportDashSamlLib.multiSamlStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSamlStrategy
  extends passportDashSamlLib.passportDashSamlMod.Strategy {
  def generateServiceProviderMetadata(
    req: expressLib.expressMod.Request,
    decryptionCert: java.lang.String,
    signingCert: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def generateServiceProviderMetadata(
    req: expressLib.expressMod.Request,
    decryptionCert: java.lang.String,
    signingCert: scala.Null,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def generateServiceProviderMetadata(
    req: expressLib.expressMod.Request,
    decryptionCert: scala.Null,
    signingCert: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def generateServiceProviderMetadata(
    req: expressLib.expressMod.Request,
    decryptionCert: scala.Null,
    signingCert: scala.Null,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): java.lang.String = js.native
}

