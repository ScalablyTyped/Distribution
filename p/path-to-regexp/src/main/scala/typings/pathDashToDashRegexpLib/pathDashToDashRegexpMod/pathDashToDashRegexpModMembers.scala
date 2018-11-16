package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", JSImport.Namespace)
@js.native
object pathDashToDashRegexpModMembers extends js.Object {
  def apply(path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Path): stdLib.RegExp = js.native
  def apply(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key]
  ): stdLib.RegExp = js.native
  def apply(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key],
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.RegExpOptions with pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.ParseOptions
  ): stdLib.RegExp = js.native
  def compile(path: java.lang.String): pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.PathFunction = js.native
  def compile(
    path: java.lang.String,
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.ParseOptions
  ): pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.PathFunction = js.native
  def parse(path: java.lang.String): js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Token] = js.native
  def parse(
    path: java.lang.String,
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.ParseOptions
  ): js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Token] = js.native
  def tokensToFunction(tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Token]): pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.PathFunction = js.native
  def tokensToRegExp(tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Token]): stdLib.RegExp = js.native
  def tokensToRegExp(
    tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Token],
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key]
  ): stdLib.RegExp = js.native
  def tokensToRegExp(
    tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Token],
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key],
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.RegExpOptions
  ): stdLib.RegExp = js.native
}

