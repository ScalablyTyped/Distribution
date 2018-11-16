package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFullTextSearchFlags extends js.Object

@JSGlobal("MFiles.MFFullTextSearchFlags")
@js.native
object MFFullTextSearchFlags extends js.Object {
  @js.native
  sealed trait LookInFileData
    extends mfilesLib.MFilesNs.MFFullTextSearchFlags
  
  @js.native
  sealed trait LookInMetaData
    extends mfilesLib.MFilesNs.MFFullTextSearchFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFFullTextSearchFlags
  
  @js.native
  sealed trait Stemming
    extends mfilesLib.MFilesNs.MFFullTextSearchFlags
  
  @js.native
  sealed trait TypeAllWords
    extends mfilesLib.MFilesNs.MFFullTextSearchFlags
  
  @js.native
  sealed trait TypeAnyWords
    extends mfilesLib.MFilesNs.MFFullTextSearchFlags
  
  /* 536870912 */ val LookInFileData: LookInFileData with scala.Double = js.native
  /* 268435456 */ val LookInMetaData: LookInMetaData with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Stemming: Stemming with scala.Double = js.native
  /* 131072 */ val TypeAllWords: TypeAllWords with scala.Double = js.native
  /* 262144 */ val TypeAnyWords: TypeAnyWords with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFullTextSearchFlags with scala.Double] = js.native
}

