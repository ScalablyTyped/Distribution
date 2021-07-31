package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2Directory extends StObject {
  
  /** Any subdirectories */
  var directories: js.UndefOr[js.Array[GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]] = js.undefined
  
  /** The files in this directory */
  var files: js.UndefOr[js.Array[GoogleDevtoolsRemoteworkersV1test2FileMetadata]] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2Directory {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2Directory]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2DirectoryMutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: js.Array[GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata*): Self = StObject.set(x, "directories", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[GoogleDevtoolsRemoteworkersV1test2FileMetadata]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: GoogleDevtoolsRemoteworkersV1test2FileMetadata*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
