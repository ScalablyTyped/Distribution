package typings.noteflightClient

import typings.noteflightClient.noteflightClientStrings.playbackRequest
import typings.noteflightClient.noteflightClientStrings.playbackStop
import typings.noteflightClient.noteflightClientStrings.scoreDataLoaded
import typings.noteflightClient.noteflightClientStrings.selectionChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type NoteflightEvent[T] = NoteflightEventProps & (EventFilter[T, scoreDataLoaded, ScoreDataLoadedProps]) & (EventFilter[T, selectionChange, SelectionChangeProps]) & (EventFilter[T, playbackRequest | playbackStop, PlaybackProps])
