package typings
package nodegitLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tag", "Tag")
@js.native
class Tag () extends js.Object {
  def dup(): stdLib.Promise[Tag] = js.native
  def free(): scala.Unit = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def message(): java.lang.String = js.native
  def name(): java.lang.String = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def peel(tagTargetOut: js.Object): scala.Double = js.native
  def tagger(): nodegitLib.signatureMod.Signature = js.native
  def target(): js.Object = js.native
  def targetId(): nodegitLib.oidMod.Oid = js.native
  def targetType(): scala.Double = js.native
}

@JSImport("nodegit/tag", "Tag")
@js.native
object Tag extends js.Object {
  def annotationCreate(
    repo: nodegitLib.repositoryMod.Repository,
    tagName: java.lang.String,
    target: js.Object,
    tagger: nodegitLib.signatureMod.Signature,
    message: java.lang.String
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    tagName: java.lang.String,
    target: js.Object,
    tagger: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    force: scala.Double
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def createLightweight(
    repo: nodegitLib.repositoryMod.Repository,
    tagName: java.lang.String,
    target: js.Object,
    force: scala.Double
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def delete(repo: nodegitLib.repositoryMod.Repository, tagName: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def list(repo: nodegitLib.repositoryMod.Repository): stdLib.Promise[js.Array[_]] = js.native
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
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieves the tag pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieves the tag pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.tagMod.Tag): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
}

