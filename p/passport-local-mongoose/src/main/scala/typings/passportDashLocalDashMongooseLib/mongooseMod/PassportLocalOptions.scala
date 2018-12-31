package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportLocalOptions extends js.Object {
  var attemptsField: js.UndefOr[java.lang.String] = js.undefined
  var digestAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var errorMessages: js.UndefOr[PassportLocalErrorMessages] = js.undefined
  var hashField: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var keylen: js.UndefOr[scala.Double] = js.undefined
  var lastLoginField: js.UndefOr[java.lang.String] = js.undefined
  var limitAttempts: js.UndefOr[scala.Boolean] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var maxInterval: js.UndefOr[scala.Double] = js.undefined
  var passwordValidator: js.UndefOr[
    js.Function2[
      /* password */ java.lang.String, 
      /* cb */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var populateFields: js.UndefOr[java.lang.String] = js.undefined
  var saltField: js.UndefOr[java.lang.String] = js.undefined
  var saltlen: js.UndefOr[scala.Double] = js.undefined
  var selectFields: js.UndefOr[java.lang.String] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
  var usernameLowerCase: js.UndefOr[scala.Boolean] = js.undefined
  var usernameQueryFields: js.Array[java.lang.String]
  var usernameUnique: js.UndefOr[scala.Boolean] = js.undefined
}

