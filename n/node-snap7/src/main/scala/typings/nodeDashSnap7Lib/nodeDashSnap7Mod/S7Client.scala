package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S7Client extends js.Object {
  /**
    * This is a lean function of ReadArea() to read PLC process outputs.
    * It simply internally calls ReadArea() with area = S7Client.S7AreaPA and wordLen = s7client.S7WLByte.
    * - start Offset to start
    * - size Size to read (bytes)
    * - The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ABRead(start: scala.Double, size: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def ABRead(
    start: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of WriteArea() to write PLC process outputs.
    * It simply internally calls WriteArea() with area = S7Client.S7AreaPA and wordLen = s7client.S7WLByte.
    * - start Offset to start
    * - size Size to write (bytes)
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def ABWrite(start: scala.Double, size: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def ABWrite(
    start: scala.Double,
    size: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * This is a lean function of ReadArea() to read PLC Counters.
    * It simply internally calls ReadArea() with area = S7Client.S7AreaCT and wordLen = S7Client.S7WLCounter.
    * - start Offset to start
    * - amount Number of counters
    * -  The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def CTRead(start: scala.Double, size: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def CTRead(
    start: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of WriteArea() to write PLC Counters.
    * It simply internally calls WriteArea() with area = S7Client.S7AreaCT and wordLen = S7Client.S7WLCounter.
    * - start Offset to start
    * - amount Number of counters
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def CTWrite(start: scala.Double, size: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def CTWrite(
    start: scala.Double,
    size: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Clears the password set for the current session (logout).
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def ClearSessionPassword(): scala.Boolean = js.native
  def ClearSessionPassword(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * Performs the Memory compress action.
    * - timeout Maximum time expected to complete the operation (ms)
    * - The optional callback parameter will be executed after completion or on timeout
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def Compress(timeout: scala.Double): scala.Boolean = js.native
  def Compress(timeout: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  //Instance members here
  //API - Control functions
  /** 
    * Connects the client to the PLC with the parameters specified in the previous call of ConnectTo() or SetConnectionParams().
    * - cb: The optional callback parameter will be executed after connection attempt
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def Connect(): scala.Boolean = js.native
  def Connect(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /** 
    * Connects the client to the hardware at ip, rack, slot coordinates.
    * - ip: PLC/Equipment IPV4 Address ex. “192.168.1.12”
    * - rack: PLC Rack number
    * - slot: PLC Slot number
    * - cb: The optional callback parameter will be executed after connection attempt
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def ConnectTo(ip: java.lang.String, rack: scala.Double, slot: scala.Double): scala.Boolean = js.native
  def ConnectTo(
    ip: java.lang.String,
    rack: scala.Double,
    slot: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Returns the connection status.
    */
  def Connected(): js.Any = js.native
  /**
    * Performs the Copy Ram to Rom action.
    * - timeout Maximum time expected to complete the operation (ms)
    * - The optional callback parameter will be executed after completion or on timeout
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    * Not all CPUs support this operation. The CPU must be in STOP mode.
    */
  def CopyRamToRom(timeout: scala.Double): scala.Boolean = js.native
  def CopyRamToRom(timeout: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * Fills a DB in AG with a given byte without the need of specifying its size.
    * - dbNumber DB number
    * - fillChar char or char code
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def DBFill(dbNumber: scala.Double, fillChar: java.lang.String): scala.Boolean = js.native
  def DBFill(
    dbNumber: scala.Double,
    fillChar: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Uploads a DB from AG. This function is equivalent to Upload() with BlockType = Block_DB but it uses a different approach 
    * so it’s not subject to the security level set.
    * Only data is uploaded.
    * - dbNumber DB number
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns a Buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    * This function first gathers the DB size via GetAgBlockInfo() then calls DBRead().
    */
  def DBGet(dbNumber: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def DBGet(
    dbNumber: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of ReadArea() to read PLC DB.
    * It simply internally calls ReadArea() with area = S7Client.S7AreaDB and wordLen = s7client.S7WLByte.
    * - dbNumber DB number
    * - start Offset to start
    * - size Size to read (bytes)
    * - The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def DBRead(dbNumber: scala.Double, start: scala.Double, size: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def DBRead(
    dbNumber: scala.Double,
    start: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of WriteArea() to write PLC DB.
    * It simply internally calls WriteArea() with area = S7Client.S7AreaDB and wordLen = s7client.S7WLByte.
    * - dbNumber DB number
    * - start Offset to start
    * - size Size to write (bytes)
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def DBWrite(dbNumber: scala.Double, start: scala.Double, size: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def DBWrite(
    dbNumber: scala.Double,
    start: scala.Double,
    size: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Deletes a block into AG.
    * !!! There is no undo function available !!!
    * - blockType Type of block (see table above)
    * - blockNum Number of block
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def Delete(blockType: BlockType, blockNum: scala.Double): scala.Boolean = js.native
  def Delete(blockType: BlockType, blockNum: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * Disconnects “gracefully” the Client from the PLC.
    * Returns true on success or false on error.
    */
  def Disconnect(): scala.Unit = js.native
  /**
    * Downloads a block into AG. A whole block (including header and footer) must be available into the user buffer.
    * - blockNum Number of block
    * - buffer User buffer
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    * If the parameter blockNum is -1, the block number is not changed else the block is downloaded with the provided number (just like a “Download As…”).
    */
  def Download(blockNum: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def Download(
    blockNum: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * This is a lean function of ReadArea() to read PLC process inputs.
    * It simply internally calls ReadArea() with area = S7Client.S7AreaPE and wordLen = s7client.S7WLByte.
    * - start Offset to start
    * - size Size to read (bytes)
    * - The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def EBRead(start: scala.Double, size: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def EBRead(
    start: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of WriteArea() to write PLC process inputs.
    * It simply internally calls WriteArea() with area = S7Client.S7AreaPE and wordLen = s7client.S7WLByte.
    * - start Offset to start
    * - size Size to write (bytes)
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def EBWrite(start: scala.Double, size: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def EBWrite(
    start: scala.Double,
    size: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Returns a textual explanation of a given error number.
    * - errNum Error number
    */
  def ErrorText(err: scala.Double): java.lang.String = js.native
  //API - Properties
  /**
    * Returns the last job execution time in milliseconds or false on error.
    */
  def ExecTime(): scala.Double | scala.Boolean = js.native
  //API - Block oriented functions
  /**
    * Uploads a block from AG. The whole block (including header and footer) is copied into the user buffer.
    * - blockType Type of block (see table above)
    * - blockNum Number of block
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns a Buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def FullUpload(blockType: BlockType, blockNum: scala.Double): js.Object | scala.Boolean = js.native
  def FullUpload(
    blockType: BlockType,
    blockNum: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ js.Object, scala.Unit]
  ): js.Object | scala.Boolean = js.native
  /**
    * Returns an object with detailed information about a given AG block. This function is very useful if you need to read or write 
    * data in a DB which you do not know the size in advance (see MC7Size field)
    * - blockType Type of block (see table above)
    * - blockNum Number of block
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an object (see below) on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def GetAgBlockInfo(blockType: BlockType, blockNum: scala.Double): js.Any | scala.Boolean = js.native
  def GetAgBlockInfo(
    blockType: BlockType,
    blockNum: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  ): js.Any | scala.Boolean = js.native
  /**
    * Gets CP (communication processor) info.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def GetCpInfo(): js.Any | scala.Boolean = js.native
  def GetCpInfo(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /**
    * Gets CPU module name, serial number and other info.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def GetCpuInfo(): js.Any | scala.Boolean = js.native
  def GetCpuInfo(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /**
    * Gets CPU order code and version info.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def GetOrderCode(): js.Any | scala.Boolean = js.native
  def GetOrderCode(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /** 
    * Reads an internal Client object parameter.
    * Returns the parameter value on success or false on error.
    */
  def GetParam(paramNumber: ParamNumber): js.Any = js.native
  /**
    * Returns detailed information about a block present in a user buffer. This function is usually used in conjunction with FullUpload(). 
    * An uploaded block saved to disk, could be loaded in a user buffer and checked with this function.
    * - buffer User buffer
    * Returns an object (see example above) on success or false on error.
    */
  def GetPgBlockInfo(buffer: nodeLib.Buffer): js.Object | scala.Boolean = js.native
  //API - Date/Time functions
  /**
    * Reads PLC date and time.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns a javascript Date() object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def GetPlcDateTime(): js.Any | scala.Boolean = js.native
  def GetPlcDateTime(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /**
    * Gets the CPU protection level info.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns the protection object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def GetProtection(): js.Any | scala.Boolean = js.native
  def GetProtection(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /**
    * Returns the last job result.
    */
  def LastError(): js.Any = js.native
  //API - Directory functions
  /**
    * This function returns an object of the AG blocks amount divided by type.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an object (see below) on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ListBlocks(): js.Object | scala.Boolean = js.native
  def ListBlocks(callback: js.Function2[/* err */ js.Any, /* data */ js.Object, scala.Unit]): js.Object | scala.Boolean = js.native
  /**
    * This function returns an array of the AG list of a specified block type.
    * - blockType Type of block (see table below)
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an array on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ListBlocksOfType(blockType: BlockType): js.Any | scala.Boolean = js.native
  def ListBlocksOfType(blockType: BlockType, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /**
    * This is a lean function of ReadArea() to read PLC Merkers.
    * It simply internally calls ReadArea() with area = S7Client.S7AreaMK and wordLen = s7client.S7WLByte.
    * - start Offset to start
    * - size Size to read (bytes)
    * - The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def MBRead(start: scala.Double, size: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def MBRead(
    start: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of WriteArea() to write PLC Merkers.
    * It simply internally calls WriteArea() with area = S7Client.S7AreaMK and wordLen = s7client.S7WLByte.
    * - start Offset to start
    * - size Size to write (bytes)
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def MBWrite(start: scala.Double, size: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def MBWrite(
    start: scala.Double,
    size: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Returns the PDU length negotiated between the client and the PLC during the connection or false on error.
    * It’s useful to know the PDU negotiated when we need to call ReadMultivar() or WriteMultiVar(). 
    * All other data transfer functions handle this information by themselves and split the telegrams automatically if needed.
    */
  def PduLength(): scala.Double | scala.Boolean = js.native
  /**
    * Returns the PDU length requested by the client or false on error. The requested PDU length can be modified with SetParam().
    */
  def PduRequested(): scala.Double | scala.Boolean = js.native
  /**
    * Puts the CPU in RUN mode performing a COLD START.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def PlcColdStart(): scala.Boolean = js.native
  def PlcColdStart(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  //API - PLC control functions
  /**
    * Puts the CPU in RUN mode performing an HOT START.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def PlcHotStart(): scala.Boolean = js.native
  def PlcHotStart(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * Returns the CPU status (running/stopped).
    * The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns the CPU status on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def PlcStatus(): Status | scala.Boolean = js.native
  def PlcStatus(callback: js.Function2[/* err */ js.Any, /* data */ Status, scala.Unit]): Status | scala.Boolean = js.native
  /**
    * Puts the CPU in STOP mode.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def PlcStop(): scala.Boolean = js.native
  def PlcStop(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  //API - Data I/O functions
  /**
    * This is the main function to read data from a PLC. With it you can read DB, Inputs, Outputs, Merkers, Timers and Counters.
    * - area Area identifier (see table below)
    * - dbNumber DB number if area = S7AreaDB, otherwise ignored
    * - start Offset to start
    * - amount Amount of words to read
    * - wordLen Word size (see table below)
    * The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ReadArea(area: Area, dbNumber: scala.Double, start: scala.Double, amount: scala.Double, wordLen: WordLen): nodeLib.Buffer | scala.Boolean = js.native
  def ReadArea(
    area: Area,
    dbNumber: scala.Double,
    start: scala.Double,
    amount: scala.Double,
    wordLen: WordLen,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is function allows to read different kind of variables from a PLC in a single call. With it you can read DB, 
    * Inputs, Outputs, Merkers, Timers and Counters.
    * - multiVars Array of objects with read information (see structure below)
    * - The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns an array on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ReadMultiVars(multiVars: js.Array[MultiVarRead]): js.Array[MultiVarsReadResult] | scala.Boolean = js.native
  def ReadMultiVars(
    multiVars: js.Array[MultiVarRead],
    callback: js.Function2[/* err */ js.Any, /* data */ js.Array[MultiVarsReadResult], scala.Unit]
  ): js.Array[MultiVarsReadResult] | scala.Boolean = js.native
  //API - System info functions
  /**
    * Reads a partial list of given idand index.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns a buffer on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ReadSZL(id: scala.Double, index: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def ReadSZL(
    id: scala.Double,
    index: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * Reads the directory of the partial lists.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns an array on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def ReadSZLList(): js.Any | scala.Boolean = js.native
  def ReadSZLList(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): js.Any | scala.Boolean = js.native
  /** 
    * Sets internally ip, localTSAP, remoteTSAP coordinates.
    * - ip PLC/Equipment IPv4 address ex. “192.168.1.12”
    * - localTSAP Local TSAP (PC TSAP)
    * - remoteTSAP Remote TSAP (PLC TSAP)
    * Returns true on success or false on error. 
    */
  def SetConnectionParams(ip: java.lang.String, localTSAP: js.Any, remoteTSAP: js.Any): scala.Boolean = js.native
  /**
    * Sets the connection resource type, i.e the way in which the Clients connects to a PLC.
    */
  def SetConnectionType(connectionType: ConnectionType): scala.Unit = js.native
  /**
    * Sets an internal Client object parameter.
    * paramNumber One from the parameter list above
    * value New parameter value
    * Returns true on success or false on error.
    */
  def SetParam(paramNumber: ParamNumber, value: js.Any): scala.Boolean = js.native
  /**
    * Sets the PLC date and time.
    * - dateTime
    * - The optional callback parameter will be executed after completion
    * The dateTime argument can be a javascript Date() object or an object with the structure below.
    * {
    *   "year": 2015,  // year 
    *   "month": 4,    // months since January     0-11 
    *   "day": 3,      // day of the month         1-31 
    *   "hours": 19,   // hours since midnight     0-23 
    *   "minutes": 37, // minutes after the hour   0-59 
    *   "seconds": 0   // seconds after the minute 0-59 
    * }
    * If callback is not set the function is blocking and returns a true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def SetPlcDateTime(dateTime: stdLib.Date): scala.Boolean = js.native
  def SetPlcDateTime(dateTime: stdLib.Date, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * Sets the PLC date and time in accord to the PC system Date/Time.
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def SetPlcSystemDateTime(): scala.Boolean = js.native
  def SetPlcSystemDateTime(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  //API - Security functions
  /**
    * Send the password to the PLC to meet its security level.
    * - password Password
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    * A password accepted by a PLC is an 8 chars string, a longer password will be trimmed, and a shorter one will be "right space padded".
    */
  def SetSessionPassword(password: java.lang.String): scala.Boolean = js.native
  def SetSessionPassword(password: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * This is a lean function of ReadArea() to read PLC Timers.
    * It simply internally calls ReadArea() with area = S7Client.S7AreaTM and wordLen = S7Client.S7WLTimer.
    * - start Offset to start
    * - amount Number of timers
    * - The optional callback parameter will be executed after read
    * If callback is not set the function is blocking and returns a buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def TMRead(start: scala.Double, size: scala.Double): nodeLib.Buffer | scala.Boolean = js.native
  def TMRead(
    start: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.Buffer | scala.Boolean = js.native
  /**
    * This is a lean function of WriteArea() to write PLC Timers.
    * It simply internally calls WriteArea() with area = S7Client.S7AreaTM and wordLen = S7Client.S7WLTimer.
    * - start Offset to start
    * - amount Number of timers
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def TMWrite(start: scala.Double, size: scala.Double, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def TMWrite(
    start: scala.Double,
    size: scala.Double,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Uploads a block body from AG. Only the block body (but header and footer) is copied into the user buffer.
    * - blockType Type of block (see table above)
    * - blockNum Number of block
    * - The optional callback parameter will be executed after completion
    * If callback is not set the function is blocking and returns a Buffer object on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def Upload(blockType: BlockType, blockNum: scala.Double): js.Object | scala.Boolean = js.native
  def Upload(
    blockType: BlockType,
    blockNum: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ js.Object, scala.Unit]
  ): js.Object | scala.Boolean = js.native
  /**
    * This is the main function to write data into a PLC.
    * - area Area identifier (see table below)
    * - dbNumber DB number if area = S7AreaDB, otherwise ignored
    * - start Offset to start
    * - amount Amount of words to read
    * - wordLen Word size (see table below)
    * - buffer User buffer
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns true on success or false on error. 
    * If callback is set the function is non-blocking and an error argument is given to the callback.
    */
  def WriteArea(
    area: Area,
    dbNumber: scala.Double,
    start: scala.Double,
    amount: scala.Double,
    wordLen: WordLen,
    buffer: nodeLib.Buffer
  ): scala.Boolean = js.native
  def WriteArea(
    area: Area,
    dbNumber: scala.Double,
    start: scala.Double,
    amount: scala.Double,
    wordLen: WordLen,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * This is function allows to write different kind of variables into a PLC in a single call. With it you can write DB, 
    * Inputs, Outputs, Merkers, Timers and Counters.
    * - multiVars Array of objects with write information (see structure below)
    * - The optional callback parameter will be executed after write
    * If callback is not set the function is blocking and returns an array on success or false on error. 
    * If callback is set the function is non-blocking and an error and result argument is given to the callback.
    */
  def WriteMultiVars(multiVars: js.Array[MultiVarWrite]): js.Array[MultiVarsWriteResult] | scala.Boolean = js.native
  def WriteMultiVars(
    multiVars: js.Array[MultiVarWrite],
    callback: js.Function2[/* err */ js.Any, /* data */ js.Array[MultiVarsWriteResult], scala.Unit]
  ): js.Array[MultiVarsWriteResult] | scala.Boolean = js.native
}

