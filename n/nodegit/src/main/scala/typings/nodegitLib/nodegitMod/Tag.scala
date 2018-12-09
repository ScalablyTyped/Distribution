package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends nodegitLib.tagMod.Tag

@JSImport("nodegit", "Tag")
@js.native
object Tag extends js.Object {
  def annotationCreate(
    repo: nodegitLib.repositoryMod.Repository,
    tagName: java.lang.String,
    target: nodegitLib.objectMod.Object,
    tagger: nodegitLib.signatureMod.Signature,
    message: java.lang.String
  ): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    tagName: java.lang.String,
    target: nodegitLib.objectMod.Object,
    tagger: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    force: scala.Double
  ): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def createLightweight(
    repo: nodegitLib.repositoryMod.Repository,
    tagName: java.lang.String,
    target: nodegitLib.objectMod.Object,
    force: scala.Double
  ): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def delete(repo: nodegitLib.repositoryMod.Repository, tagName: java.lang.String): js.Promise[scala.Double] = js.native
  def list(repo: nodegitLib.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def listMatch(tagNames: java.lang.String, pattern: java.lang.String, repo: nodegitLib.repositoryMod.Repository): scala.Double = js.native
  def listMatch(
    tagNames: js.Array[java.lang.String],
    pattern: java.lang.String,
    repo: nodegitLib.repositoryMod.Repository
  ): scala.Double = js.native
  def listMatch(
    tagNames: nodegitLib.strDashArrayMod.Strarray,
    pattern: java.lang.String,
    repo: nodegitLib.repositoryMod.Repository
  ): scala.Double = js.native
  /**
       * Retrieves the tag pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): js.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieves the tag pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieves the tag pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.tagMod.Tag): js.Promise[nodegitLib.tagMod.Tag] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): js.Promise[nodegitLib.tagMod.Tag] = js.native
}

