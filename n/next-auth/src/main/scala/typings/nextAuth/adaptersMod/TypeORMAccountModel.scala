package typings.nextAuth.adaptersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-auth/adapters", "TypeORMAccountModel")
@js.native
class TypeORMAccountModel protected () extends js.Object {
  def this(userId: Double, providerId: String, providerType: String, providerAccountId: String) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: String
  ) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: js.UndefOr[scala.Nothing],
    accessToken: String
  ) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: String,
    accessToken: String
  ) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: js.UndefOr[scala.Nothing],
    accessToken: js.UndefOr[scala.Nothing],
    accessTokenExpires: Date
  ) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: js.UndefOr[scala.Nothing],
    accessToken: String,
    accessTokenExpires: Date
  ) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: String,
    accessToken: js.UndefOr[scala.Nothing],
    accessTokenExpires: Date
  ) = this()
  def this(
    userId: Double,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: String,
    accessToken: String,
    accessTokenExpires: Date
  ) = this()
  
  var accessToken: js.UndefOr[String] = js.native
  
  var accessTokenExpires: js.UndefOr[Date] = js.native
  
  var compoundId: String = js.native
  
  var providerAccountId: String = js.native
  
  var providerId: String = js.native
  
  var providerType: String = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var userId: Double = js.native
}
