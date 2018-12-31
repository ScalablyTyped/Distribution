package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Attr")
@js.native
class Attr ()
  extends nodegitLib.attrMod.Attr

@JSImport("nodegit", "Attr")
@js.native
object Attr extends js.Object {
  def addMacro(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, values: java.lang.String): scala.Double = js.native
  def cacheFlush(repo: nodegitLib.repositoryMod.Repository): scala.Unit = js.native
  /**
    * @param repo - The repository containing the path.
    * @param flags - A combination of GIT_ATTR_CHECK... flags.
    * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
    * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
    * @param name - The name of the attribute to look up.
    * @returns - Output of the value of the attribute. Use the GIT_ATTR_...
    */
  def get(
    repo: nodegitLib.repositoryMod.Repository,
    flags: scala.Double,
    path: java.lang.String,
    name: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  /**
    * @param repo - The repository containing the path.
    * @param flags - A combination of GIT_ATTR_CHECK... flags.
    * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
    * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
    * @param numAttr - The number of attributes being looked up
    * @param names - An array of num_attr strings containing attribute names.
    */
  def getMany(
    repo: nodegitLib.repositoryMod.Repository,
    flags: scala.Double,
    path: java.lang.String,
    numAttr: scala.Double,
    names: java.lang.String
  ): js.Array[_] = js.native
  /**
    * @param attr - The attribute
    * @returns - the value type for the attribute
    */
  def value(attr: java.lang.String): scala.Double = js.native
}

