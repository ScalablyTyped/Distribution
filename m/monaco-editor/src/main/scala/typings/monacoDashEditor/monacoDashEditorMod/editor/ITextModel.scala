package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import typings.monacoDashEditor.monacoDashEditorMod.IPosition
import typings.monacoDashEditor.monacoDashEditorMod.IRange
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.Range
import typings.monacoDashEditor.monacoDashEditorMod.Selection
import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextModel extends IEditorModel {
  /**
    * A unique identifier associated with this model.
    */
  val id: String = js.native
  /**
    * Gets the resource associated with this editor model.
    */
  val uri: Uri = js.native
  /**
    * Edit the model without adding the edits to the undo stack.
    * This can have dire consequences on the undo stack! See @pushEditOperations for the preferred way.
    * @param operations The edit operations.
    * @return The inverse edit operations, that, when applied, will bring the model back to the previous state.
    */
  def applyEdits(operations: js.Array[IIdentifiedSingleEditOperation]): js.Array[IIdentifiedSingleEditOperation] = js.native
  /**
    * Perform a minimum amount of operations, in order to transform the decorations
    * identified by `oldDecorations` to the decorations described by `newDecorations`
    * and returns the new identifiers associated with the resulting decorations.
    *
    * @param oldDecorations Array containing previous decorations identifiers.
    * @param newDecorations Array describing what decorations should result after the call.
    * @param ownerId Identifies the editor id in which these decorations should appear. If no `ownerId` is provided, the decorations will appear in all editors that attach this model.
    * @return An array containing the new decorations identifiers.
    */
  def deltaDecorations(oldDecorations: js.Array[String], newDecorations: js.Array[IModelDeltaDecoration]): js.Array[String] = js.native
  def deltaDecorations(oldDecorations: js.Array[String], newDecorations: js.Array[IModelDeltaDecoration], ownerId: Double): js.Array[String] = js.native
  /**
    * Detect the indentation options for this model from its content.
    */
  def detectIndentation(defaultInsertSpaces: Boolean, defaultTabSize: Double): Unit = js.native
  /**
    * Destroy this model. This will unbind the model from the mode
    * and make all necessary clean-up to release this object to the GC.
    */
  def dispose(): Unit = js.native
  /**
    * Search the model.
    * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
    * @param searchOnlyEditableRange Limit the searching to only search inside the editable range of the model.
    * @param isRegex Used to indicate that `searchString` is a regular expression.
    * @param matchCase Force the matching to match lower/upper case exactly.
    * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
    * @param captureMatches The result will contain the captured groups.
    * @param limitResultCount Limit the number of results
    * @return The ranges where the matches are. It is empty if not matches have been found.
    */
  def findMatches(
    searchString: String,
    searchOnlyEditableRange: Boolean,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: String,
    captureMatches: Boolean
  ): js.Array[FindMatch] = js.native
  def findMatches(
    searchString: String,
    searchOnlyEditableRange: Boolean,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: String,
    captureMatches: Boolean,
    limitResultCount: Double
  ): js.Array[FindMatch] = js.native
  def findMatches(
    searchString: String,
    searchOnlyEditableRange: Boolean,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: Null,
    captureMatches: Boolean
  ): js.Array[FindMatch] = js.native
  def findMatches(
    searchString: String,
    searchOnlyEditableRange: Boolean,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: Null,
    captureMatches: Boolean,
    limitResultCount: Double
  ): js.Array[FindMatch] = js.native
  /**
    * Search the model.
    * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
    * @param searchScope Limit the searching to only search inside this range.
    * @param isRegex Used to indicate that `searchString` is a regular expression.
    * @param matchCase Force the matching to match lower/upper case exactly.
    * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
    * @param captureMatches The result will contain the captured groups.
    * @param limitResultCount Limit the number of results
    * @return The ranges where the matches are. It is empty if no matches have been found.
    */
  def findMatches(
    searchString: String,
    searchScope: IRange,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: String,
    captureMatches: Boolean
  ): js.Array[FindMatch] = js.native
  def findMatches(
    searchString: String,
    searchScope: IRange,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: String,
    captureMatches: Boolean,
    limitResultCount: Double
  ): js.Array[FindMatch] = js.native
  def findMatches(
    searchString: String,
    searchScope: IRange,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: Null,
    captureMatches: Boolean
  ): js.Array[FindMatch] = js.native
  def findMatches(
    searchString: String,
    searchScope: IRange,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: Null,
    captureMatches: Boolean,
    limitResultCount: Double
  ): js.Array[FindMatch] = js.native
  /**
    * Search the model for the next match. Loops to the beginning of the model if needed.
    * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
    * @param searchStart Start the searching at the specified position.
    * @param isRegex Used to indicate that `searchString` is a regular expression.
    * @param matchCase Force the matching to match lower/upper case exactly.
    * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
    * @param captureMatches The result will contain the captured groups.
    * @return The range where the next match is. It is null if no next match has been found.
    */
  def findNextMatch(
    searchString: String,
    searchStart: IPosition,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: String,
    captureMatches: Boolean
  ): FindMatch | Null = js.native
  def findNextMatch(
    searchString: String,
    searchStart: IPosition,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: Null,
    captureMatches: Boolean
  ): FindMatch | Null = js.native
  /**
    * Search the model for the previous match. Loops to the end of the model if needed.
    * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
    * @param searchStart Start the searching at the specified position.
    * @param isRegex Used to indicate that `searchString` is a regular expression.
    * @param matchCase Force the matching to match lower/upper case exactly.
    * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
    * @param captureMatches The result will contain the captured groups.
    * @return The range where the previous match is. It is null if no previous match has been found.
    */
  def findPreviousMatch(
    searchString: String,
    searchStart: IPosition,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: String,
    captureMatches: Boolean
  ): FindMatch | Null = js.native
  def findPreviousMatch(
    searchString: String,
    searchStart: IPosition,
    isRegex: Boolean,
    matchCase: Boolean,
    wordSeparators: Null,
    captureMatches: Boolean
  ): FindMatch | Null = js.native
  /**
    * Gets all the decorations as an array.
    * @param ownerId If set, it will ignore decorations belonging to other owners.
    * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
    */
  def getAllDecorations(): js.Array[IModelDecoration] = js.native
  def getAllDecorations(ownerId: Double): js.Array[IModelDecoration] = js.native
  def getAllDecorations(ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
  /**
    * Get the alternative version id of the model.
    * This alternative version id is not always incremented,
    * it will return the same values in the case of undo-redo.
    */
  def getAlternativeVersionId(): Double = js.native
  /**
    * Get the options associated with a decoration.
    * @param id The decoration id.
    * @return The decoration options or null if the decoration was not found.
    */
  def getDecorationOptions(id: String): IModelDecorationOptions | Null = js.native
  /**
    * Get the range associated with a decoration.
    * @param id The decoration id.
    * @return The decoration range or null if the decoration was not found.
    */
  def getDecorationRange(id: String): Range | Null = js.native
  /**
    * Gets all the decorations in a range as an array. Only `startLineNumber` and `endLineNumber` from `range` are used for filtering.
    * So for now it returns all the decorations on the same line as `range`.
    * @param range The range to search in
    * @param ownerId If set, it will ignore decorations belonging to other owners.
    * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
    * @return An array with the decorations
    */
  def getDecorationsInRange(range: IRange): js.Array[IModelDecoration] = js.native
  def getDecorationsInRange(range: IRange, ownerId: Double): js.Array[IModelDecoration] = js.native
  def getDecorationsInRange(range: IRange, ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
  /**
    * Get the end of line sequence predominantly used in the text buffer.
    * @return EOL char sequence (e.g.: '\n' or '\r\n').
    */
  def getEOL(): String = js.native
  /**
    * Get a range covering the entire model
    */
  def getFullModelRange(): Range = js.native
  /**
    * Get the text for a certain line.
    */
  def getLineContent(lineNumber: Double): String = js.native
  /**
    * Get the number of lines in the model.
    */
  def getLineCount(): Double = js.native
  /**
    * Gets all the decorations for the line `lineNumber` as an array.
    * @param lineNumber The line number
    * @param ownerId If set, it will ignore decorations belonging to other owners.
    * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
    * @return An array with the decorations
    */
  def getLineDecorations(lineNumber: Double): js.Array[IModelDecoration] = js.native
  def getLineDecorations(lineNumber: Double, ownerId: Double): js.Array[IModelDecoration] = js.native
  def getLineDecorations(lineNumber: Double, ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
  /**
    * Returns the column before the first non whitespace character for line at `lineNumber`.
    * Returns 0 if line is empty or contains only whitespace.
    */
  def getLineFirstNonWhitespaceColumn(lineNumber: Double): Double = js.native
  /**
    * Returns the column after the last non whitespace character for line at `lineNumber`.
    * Returns 0 if line is empty or contains only whitespace.
    */
  def getLineLastNonWhitespaceColumn(lineNumber: Double): Double = js.native
  /**
    * Get the text length for a certain line.
    */
  def getLineLength(lineNumber: Double): Double = js.native
  /**
    * Get the maximum legal column for line at `lineNumber`
    */
  def getLineMaxColumn(lineNumber: Double): Double = js.native
  /**
    * Get the minimum legal column for line at `lineNumber`
    */
  def getLineMinColumn(lineNumber: Double): Double = js.native
  /**
    * Get the text for all lines.
    */
  def getLinesContent(): js.Array[String] = js.native
  /**
    * Gets all the decorations for the lines between `startLineNumber` and `endLineNumber` as an array.
    * @param startLineNumber The start line number
    * @param endLineNumber The end line number
    * @param ownerId If set, it will ignore decorations belonging to other owners.
    * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
    * @return An array with the decorations
    */
  def getLinesDecorations(startLineNumber: Double, endLineNumber: Double): js.Array[IModelDecoration] = js.native
  def getLinesDecorations(startLineNumber: Double, endLineNumber: Double, ownerId: Double): js.Array[IModelDecoration] = js.native
  def getLinesDecorations(startLineNumber: Double, endLineNumber: Double, ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
  /**
    * Get the language associated with this model.
    */
  def getModeId(): String = js.native
  /**
    * Converts the position to a zero-based offset.
    *
    * The position will be [adjusted](#TextDocument.validatePosition).
    *
    * @param position A position.
    * @return A valid zero-based offset.
    */
  def getOffsetAt(position: IPosition): Double = js.native
  /**
    * Get the resolved options for this model.
    */
  def getOptions(): TextModelResolvedOptions = js.native
  /**
    * Gets all the decorations that should be rendered in the overview ruler as an array.
    * @param ownerId If set, it will ignore decorations belonging to other owners.
    * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
    */
  def getOverviewRulerDecorations(): js.Array[IModelDecoration] = js.native
  def getOverviewRulerDecorations(ownerId: Double): js.Array[IModelDecoration] = js.native
  def getOverviewRulerDecorations(ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
  /**
    * Converts a zero-based offset to a position.
    *
    * @param offset A zero-based offset.
    * @return A valid [position](#Position).
    */
  def getPositionAt(offset: Double): Position = js.native
  /**
    * Get the text stored in this model.
    * @param eol The end of line character preference. Defaults to `EndOfLinePreference.TextDefined`.
    * @param preserverBOM Preserve a BOM character if it was detected when the model was constructed.
    * @return The text.
    */
  def getValue(): String = js.native
  def getValue(eol: EndOfLinePreference): String = js.native
  def getValue(eol: EndOfLinePreference, preserveBOM: Boolean): String = js.native
  /**
    * Get the text in a certain range.
    * @param range The range describing what text to get.
    * @param eol The end of line character preference. This will only be used for multiline ranges. Defaults to `EndOfLinePreference.TextDefined`.
    * @return The text.
    */
  def getValueInRange(range: IRange): String = js.native
  def getValueInRange(range: IRange, eol: EndOfLinePreference): String = js.native
  /**
    * Get the length of the text stored in this model.
    */
  def getValueLength(): Double = js.native
  def getValueLength(eol: EndOfLinePreference): Double = js.native
  def getValueLength(eol: EndOfLinePreference, preserveBOM: Boolean): Double = js.native
  /**
    * Get the length of text in a certain range.
    * @param range The range describing what text length to get.
    * @return The text length.
    */
  def getValueLengthInRange(range: IRange): Double = js.native
  /**
    * Get the current version id of the model.
    * Anytime a change happens to the model (even undo/redo),
    * the version id is incremented.
    */
  def getVersionId(): Double = js.native
  /**
    * Get the word under or besides `position`.
    * @param position The position to look for a word.
    * @return The word under or besides `position`. Might be null.
    */
  def getWordAtPosition(position: IPosition): IWordAtPosition | Null = js.native
  /**
    * Get the word under or besides `position` trimmed to `position`.column
    * @param position The position to look for a word.
    * @return The word under or besides `position`. Will never be null.
    */
  def getWordUntilPosition(position: IPosition): IWordAtPosition = js.native
  /**
    * Returns if the model was disposed or not.
    */
  def isDisposed(): Boolean = js.native
  /**
    * Advances the given position by the given offset (negative offsets are also accepted)
    * and returns it as a new valid position.
    *
    * If the offset and position are such that their combination goes beyond the beginning or
    * end of the model, throws an exception.
    *
    * If the offset is such that the new position would be in the middle of a multi-byte
    * line terminator, throws an exception.
    */
  def modifyPosition(position: IPosition, offset: Double): Position = js.native
  /**
    * Normalize a string containing whitespace according to indentation rules (converts to spaces or to tabs).
    */
  def normalizeIndentation(str: String): String = js.native
  /**
    * An event emitted when the contents of the model have changed.
    * @event
    */
  def onDidChangeContent(listener: js.Function1[/* e */ IModelContentChangedEvent, Unit]): IDisposable = js.native
  /**
    * An event emitted when decorations of the model have changed.
    * @event
    */
  def onDidChangeDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Unit]): IDisposable = js.native
  /**
    * An event emitted when the language associated with the model has changed.
    * @event
    */
  def onDidChangeLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, Unit]): IDisposable = js.native
  /**
    * An event emitted when the language configuration associated with the model has changed.
    * @event
    */
  def onDidChangeLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, Unit]): IDisposable = js.native
  /**
    * An event emitted when the model options have changed.
    * @event
    */
  def onDidChangeOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, Unit]): IDisposable = js.native
  /**
    * An event emitted right before disposing the model.
    * @event
    */
  def onWillDispose(listener: js.Function0[Unit]): IDisposable = js.native
  /**
    * Change the end of line sequence. This is the preferred way of
    * changing the eol sequence. This will land on the undo stack.
    */
  def pushEOL(eol: EndOfLineSequence): Unit = js.native
  /**
    * Push edit operations, basically editing the model. This is the preferred way
    * of editing the model. The edit operations will land on the undo stack.
    * @param beforeCursorState The cursor state before the edit operations. This cursor state will be returned when `undo` or `redo` are invoked.
    * @param editOperations The edit operations.
    * @param cursorStateComputer A callback that can compute the resulting cursors state after the edit operations have been executed.
    * @return The cursor state returned by the `cursorStateComputer`.
    */
  def pushEditOperations(
    beforeCursorState: js.Array[Selection],
    editOperations: js.Array[IIdentifiedSingleEditOperation],
    cursorStateComputer: ICursorStateComputer
  ): js.Array[Selection] | Null = js.native
  /**
    * Push a stack element onto the undo stack. This acts as an undo/redo point.
    * The idea is to use `pushEditOperations` to edit the model and then to
    * `pushStackElement` to create an undo/redo stop point.
    */
  def pushStackElement(): Unit = js.native
  /**
    * Change the end of line sequence without recording in the undo stack.
    * This can have dire consequences on the undo stack! See @pushEOL for the preferred way.
    */
  def setEOL(eol: EndOfLineSequence): Unit = js.native
  /**
    * Replace the entire text buffer value contained in this model.
    */
  def setValue(newValue: String): Unit = js.native
  /**
    * Change the options of this model.
    */
  def updateOptions(newOpts: ITextModelUpdateOptions): Unit = js.native
  /**
    * Create a valid position,
    */
  def validatePosition(position: IPosition): Position = js.native
  /**
    * Create a valid range.
    */
  def validateRange(range: IRange): Range = js.native
}

