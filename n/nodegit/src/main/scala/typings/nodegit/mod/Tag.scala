package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends typings.nodegit.tagMod.Tag
/* static members */
@JSImport("nodegit", "Tag")
@js.native
object Tag extends js.Object {
  
  def annotationCreate(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    tagger: typings.nodegit.signatureMod.Signature,
    message: String
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    tagger: typings.nodegit.signatureMod.Signature,
    message: String,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  def createLightweight(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  def delete(repo: typings.nodegit.repositoryMod.Repository, tagName: String): js.Promise[Double] = js.native
  
  def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  def listMatch(tagNames: String, pattern: String, repo: typings.nodegit.repositoryMod.Repository): Double = js.native
  def listMatch(tagNames: js.Array[String], pattern: String, repo: typings.nodegit.repositoryMod.Repository): Double = js.native
  def listMatch(
    tagNames: typings.nodegit.strArrayMod.Strarray,
    pattern: String,
    repo: typings.nodegit.repositoryMod.Repository
  ): Double = js.native
  
  /**
    * Retrieves the tag pointed to by the oid
    *
    *
    */
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.tagMod.Tag] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.tagMod.Tag] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.tagMod.Tag): js.Promise[typings.nodegit.tagMod.Tag] = js.native
  
  def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.tagMod.Tag] = js.native
}
