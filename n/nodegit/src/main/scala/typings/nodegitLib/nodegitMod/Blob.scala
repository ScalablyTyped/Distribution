package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Blob")
@js.native
class Blob ()
  extends nodegitLib.blobMod.Blob

@JSImport("nodegit", "Blob")
@js.native
object Blob extends js.Object {
  /**
    * @param repo - repository where to blob will be written
    * @param buffer - data to be written into the blob
    * @param len - length of the data
    * @returns - return the id of the written blob
    */
  def createFromBuffer(repo: nodegitLib.repositoryMod.Repository, buffer: nodeLib.Buffer, len: scala.Double): nodegitLib.oidMod.Oid = js.native
  /**
    * @param id - return the id of the written blob
    * @param repo - repository where the blob will be written. this repository can be bare or not
    * @param path - file from which the blob will be created
    */
  def createFromDisk(id: nodegitLib.oidMod.Oid, repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): scala.Double = js.native
  def createFromStream(repo: nodegitLib.repositoryMod.Repository, hintPath: java.lang.String): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  /**
    * @param id - return the id of the written blob
    * @param repo - repository where the blob will be written. this repository cannot be bare
    * @param relativePath - file from which the blob will be created, relative to the repository's working dir
    * @returns - 0 or an error code
    */
  def createFromWorkdir(
    id: nodegitLib.oidMod.Oid,
    repo: nodegitLib.repositoryMod.Repository,
    relativePath: java.lang.String
  ): scala.Double = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): js.Promise[nodegitLib.blobMod.Blob] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.blobMod.Blob): js.Promise[nodegitLib.blobMod.Blob] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.blobMod.Blob] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): js.Promise[nodegitLib.blobMod.Blob] = js.native
}

