package typings.nodegit.attrMod.Attr

import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/attr", "Attr")
@js.native
object ^ extends js.Object {
  
  def addMacro(repo: Repository, name: String, values: String): Double = js.native
  
  def cacheFlush(repo: Repository): Unit = js.native
  
  /**
    * @param repo - The repository containing the path.
    * @param flags - A combination of GIT_ATTR_CHECK... flags.
    * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
    * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
    * @param name - The name of the attribute to look up.
    * @returns - Output of the value of the attribute. Use the GIT_ATTR_...
    */
  def get(repo: Repository, flags: Double, path: String, name: String): js.Promise[String] = js.native
  
  /**
    * @param repo - The repository containing the path.
    * @param flags - A combination of GIT_ATTR_CHECK... flags.
    * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
    * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
    * @param numAttr - The number of attributes being looked up
    * @param names - An array of num_attr strings containing attribute names.
    */
  def getMany(repo: Repository, flags: Double, path: String, numAttr: Double, names: String): js.Array[_] = js.native
  
  /**
    * @param attr - The attribute
    * @returns - the value type for the attribute
    */
  def value(attr: String): Double = js.native
}
