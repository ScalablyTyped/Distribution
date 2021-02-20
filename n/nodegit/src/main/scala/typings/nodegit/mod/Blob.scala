package typings.nodegit.mod

import typings.node.Buffer
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Blob")
@js.native
class Blob ()
  extends typings.nodegit.blobMod.Blob
/* static members */
object Blob {
  
  /**
    * @param repo - repository where to blob will be written
    * @param buffer - data to be written into the blob
    * @param len - length of the data
    * @returns - return the id of the written blob
    */
  @JSImport("nodegit", "Blob.createFromBuffer")
  @js.native
  def createFromBuffer(repo: typings.nodegit.repositoryMod.Repository, buffer: Buffer, len: Double): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  /**
    * @param repo - repository where the blob will be written. this repository can be bare or not
    * @param path - file from which the blob will be created
    */
  @JSImport("nodegit", "Blob.createFromDisk")
  @js.native
  def createFromDisk(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Blob.createFromStream")
  @js.native
  def createFromStream(repo: typings.nodegit.repositoryMod.Repository, hintPath: String): js.Promise[WriteStream] = js.native
  
  /**
    * @param repo - repository where the blob will be written. this repository cannot be bare
    * @param relativePath - file from which the blob will be created, relative to the repository's working dir
    * @returns - 0 or an error code
    */
  @JSImport("nodegit", "Blob.createFromWorkdir")
  @js.native
  def createFromWorkdir(repo: typings.nodegit.repositoryMod.Repository, relativePath: String): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Blob.filteredContent")
  @js.native
  def filteredContent(blob: typings.nodegit.blobMod.Blob, as_path: String, check_for_binary_data: Double): js.Promise[Buffer] = js.native
  
  @JSImport("nodegit", "Blob.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.blobMod.Blob] = js.native
  @JSImport("nodegit", "Blob.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.blobMod.Blob): js.Promise[typings.nodegit.blobMod.Blob] = js.native
  @JSImport("nodegit", "Blob.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.blobMod.Blob] = js.native
  
  @JSImport("nodegit", "Blob.lookupPrefix")
  @js.native
  def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.blobMod.Blob] = js.native
}
