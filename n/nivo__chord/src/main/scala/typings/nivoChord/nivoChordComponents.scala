package typings.nivoChord

import typings.nivoChord.mod.ChordCanvasProps
import typings.nivoChord.mod.ChordProps
import typings.nivoCore.mod.Dimensions
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoChordComponents extends nivoChordProps {
  @scala.inline
  def Chord: ComponentType[ChordProps with Dimensions] = js.constructorOf[typings.nivoChord.mod.Chord].asInstanceOf[ComponentType[ChordProps with Dimensions]]
  @scala.inline
  def ChordCanvas: ComponentType[ChordCanvasProps with Dimensions] = js.constructorOf[typings.nivoChord.mod.ChordCanvas].asInstanceOf[ComponentType[ChordCanvasProps with Dimensions]]
  @scala.inline
  def ResponsiveChord: ComponentType[ResponsiveChordProps] = js.constructorOf[typings.nivoChord.mod.ResponsiveChord].asInstanceOf[ComponentType[ResponsiveChordProps]]
  @scala.inline
  def ResponsiveChordCanvas: ComponentType[ResponsiveChordCanvasProps] = js.constructorOf[typings.nivoChord.mod.ResponsiveChordCanvas].asInstanceOf[ComponentType[ResponsiveChordCanvasProps]]
}

