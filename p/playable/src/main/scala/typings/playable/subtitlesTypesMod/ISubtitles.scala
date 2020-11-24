package typings.playable.subtitlesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubtitles extends js.Object {
  
  def destroy(): Unit = js.native
  
  def hideSubtitles(): Unit = js.native
  
  def removeSubtitles(): Unit = js.native
  
  def setActiveSubtitle(index: Double): Unit = js.native
  
  def setSubtitles(subtitles: String): Unit = js.native
  def setSubtitles(subtitles: js.Array[ISubtitleConfig]): Unit = js.native
  def setSubtitles(subtitles: ISubtitleConfig): Unit = js.native
  
  def showSubtitles(): Unit = js.native
}
