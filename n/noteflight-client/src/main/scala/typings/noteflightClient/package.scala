package typings.noteflightClient

import typings.noteflightClient.noteflightClientStrings.playbackRequest
import typings.noteflightClient.noteflightClientStrings.playbackStop
import typings.noteflightClient.noteflightClientStrings.scoreDataLoaded
import typings.noteflightClient.noteflightClientStrings.selectionChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends Event ? Props : T extends 'any' ? std.Partial<Props> : {}
  }}}
  */
type EventFilter[T, Event, Props] = Props

type NoteflightEvent[T] = NoteflightEventProps & (EventFilter[T, scoreDataLoaded, ScoreDataLoadedProps]) & (EventFilter[T, selectionChange, SelectionChangeProps]) & (EventFilter[T, playbackRequest | playbackStop, PlaybackProps])
