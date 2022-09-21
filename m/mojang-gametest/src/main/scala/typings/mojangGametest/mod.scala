package typings.mojangGametest

import typings.mojangGametest.mojangGametestStrings.day
import typings.mojangGametest.mojangGametestStrings.night
import typings.mojangMinecraft.mod.Block
import typings.mojangMinecraft.mod.BlockLocation
import typings.mojangMinecraft.mod.BlockPermutation
import typings.mojangMinecraft.mod.BlockType
import typings.mojangMinecraft.mod.Dimension
import typings.mojangMinecraft.mod.Direction
import typings.mojangMinecraft.mod.Entity
import typings.mojangMinecraft.mod.FluidType
import typings.mojangMinecraft.mod.GameMode
import typings.mojangMinecraft.mod.ItemStack
import typings.mojangMinecraft.mod.ItemType
import typings.mojangMinecraft.mod.Location
import typings.mojangMinecraft.mod.NavigationResult
import typings.mojangMinecraft.mod.Player
import typings.mojangMinecraft.mod.Vector
import typings.mojangMinecraft.mod.XYRotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mojang-gametest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mojang-gametest", "FenceConnectivity")
  @js.native
  /* protected */ open class FenceConnectivity () extends StObject {
    
    /**
      * Represents whether this fence block is connected to another
      * fence to the east (x + 1).
      */
    val east: Boolean = js.native
    
    /**
      * Represents whether this fence block is connected to another
      * fence to the north (z - 1).
      */
    val north: Boolean = js.native
    
    /**
      * Represents whether this fence block is connected to another
      * fence to the south (z + 1).
      */
    val south: Boolean = js.native
    
    /**
      * Represents whether this fence block is connected to another
      * fence to the west (x - 1).
      */
    val west: Boolean = js.native
  }
  
  @JSImport("mojang-gametest", "GameTestSequence")
  @js.native
  /* protected */ open class GameTestSequence () extends StObject {
    
    /**
      * @remarks
      * Runs the given callback as a step within a GameTest
      * sequence. Exceptions thrown within the callback will end
      * sequence execution.
      * @param callback
      * Callback function to execute.
      * @returns
      * Returns a GameTestSequence object where additional .thenXyz
      * method steps can be added.
      */
    def thenExecute(callback: js.Function0[Unit]): GameTestSequence = js.native
    
    /**
      * @remarks
      * After a delay, runs the given callback as a step within a
      * GameTest sequence. Exceptions thrown within the callback
      * will end sequence execution.
      * @param delayTicks
      * Number of ticks to wait before executing the callback.
      * @param callback
      * Callback function to execute.
      * @returns
      * Returns a GameTestSequence object where additional .thenXyz
      * method steps can be added.
      */
    def thenExecuteAfter(delayTicks: Double, callback: js.Function0[Unit]): GameTestSequence = js.native
    
    /**
      * @remarks
      * Runs the given callback every tick for the given number of
      * ticks.
      * @param tickCount
      * @param callback
      * Callback function to execute.
      * @returns
      * Returns a GameTestSequence object where additional .thenXyz
      * method steps can be added.
      */
    def thenExecuteFor(tickCount: Double, callback: js.Function0[Unit]): GameTestSequence = js.native
    
    /**
      * @remarks
      * Causes the test to fail if this step in the GameTest
      * sequence is reached.
      * @param errorMessage
      * Error message summarizing the failure condition.
      */
    def thenFail(errorMessage: String): Unit = js.native
    
    /**
      * @remarks
      * Idles the GameTest sequence for the specified delayTicks.
      * @param delayTicks
      * Number of ticks to delay for this step in the GameTest
      * sequence.
      * @returns
      * Returns a GameTestSequence object where additional .thenXyz
      * method steps can be added.
      */
    def thenIdle(delayTicks: Double): GameTestSequence = js.native
    
    /**
      * @remarks
      * Marks the GameTest a success if this step is reached in the
      * GameTest sequence.
      */
    def thenSucceed(): Unit = js.native
    
    /**
      * @remarks
      * Executes the given callback every tick until it succeeds.
      * Exceptions thrown within the callback will end sequence
      * execution.
      * @param callback
      * Testing callback function to execute. Typically, this
      * function will have .assertXyz functions within it.
      * @returns
      * Returns a GameTestSequence object where additional .thenXyz
      * method steps can be added.
      */
    def thenWait(callback: js.Function0[Unit]): GameTestSequence = js.native
    
    /**
      * @remarks
      * After a delay from the previous step, executes the given
      * callback every tick until it succeeds. Exceptions thrown
      * within the callback will end sequence execution.
      * @param delayTicks
      * Tick (after the previous step in the GameTest sequence) to
      * run the callback at.
      * @param callback
      * Testing callback function to execute. Typically, this
      * function will have .assertXyz functions within it.
      * @returns
      * Returns a GameTestSequence object where additional .thenXyz
      * method steps can be added.
      */
    def thenWaitAfter(delayTicks: Double, callback: js.Function0[Unit]): GameTestSequence = js.native
  }
  
  @JSImport("mojang-gametest", "RegistrationBuilder")
  @js.native
  /* protected */ open class RegistrationBuilder () extends StObject {
    
    /**
      * @remarks
      * Sets the batch for the test to run in.
      * @param batchName
      * Name of the batch for the test.
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def batch(batchName: night | day): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Sets the maximum number of times a test will try to rerun if
      * it fails.
      * @param attemptCount
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def maxAttempts(attemptCount: Double): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Sets the maximum number of ticks a test will run for before
      * timing out and failing.
      * @param tickCount
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def maxTicks(tickCount: Double): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Size around the GameTest, in blocks, that should be reserved
      * for the test when running multiple tests together.
      * @param paddingBlocks
      * Size, in blocks, around the GameTest where additional
      * GameTests should not be created.
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def padding(paddingBlocks: Double): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Whether this test is required to pass as part of its broader
      * set of tests.
      * @param isRequired
      * If set to true, the test must pass in order for the entire
      * run of tests to pass.
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def required(isRequired: Boolean): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Sets the number of successful test runs to be considered
      * successful.
      * @param attemptCount
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def requiredSuccessfulAttempts(attemptCount: Double): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * If true, runs the test in all four rotations when run via
      * /gametest runset.
      * @param rotate
      */
    def rotateTest(rotate: Boolean): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Sets the number of ticks for a test to wait before executing
      * when the structure is spawned.
      * @param tickCount
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def setupTicks(tickCount: Double): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Sets the name of the structure for a test to use. "xyz:bar"
      * will load `/structures/xyz/bar.mcstructure` from the
      * behavior pack stack.
      * @param structureName
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def structureName(structureName: String): RegistrationBuilder = js.native
    
    /**
      * @remarks
      * Adds a tag to a test. You can run all tests with a given tag
      * with `/gametest runset <tag>`.
      * @param tag
      * @returns
      * RegistrationBuilder object where additional configuration
      * methods can be called.
      */
    def tag(tag: String): RegistrationBuilder = js.native
  }
  
  @JSImport("mojang-gametest", "SculkSpreader")
  @js.native
  /* protected */ open class SculkSpreader () extends StObject {
    
    /**
      * @remarks
      * Adds a cursor - which is a notional waypoint that the sculk
      * will spread in the direction of.
      * @param offset
      * @param charge
      */
    def addCursorsWithOffset(offset: BlockLocation, charge: Double): Unit = js.native
    
    /**
      * @remarks
      * Retrieves the current position of the specified cursor.
      * @param index
      * @throws This function can throw errors.
      */
    def getCursorPosition(index: Double): BlockLocation = js.native
    
    /**
      * @remarks
      * Returns a number of overall cursors for this sculk spreader.
      * @throws This function can throw errors.
      */
    def getNumberOfCursors(): Double = js.native
    
    /**
      * @remarks
      * Gets the total current charge of the sculk spreader.
      * @throws This function can throw errors.
      */
    def getTotalCharge(): Double = js.native
    
    /**
      * Gets the maximum charge of a sculk spreader.
      * @throws This property can throw when used.
      */
    val maxCharge: Double = js.native
  }
  
  @JSImport("mojang-gametest", "SimulatedPlayer")
  @js.native
  /* protected */ open class SimulatedPlayer () extends Player {
    
    def addExperience(amount: Double): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to make an attack 'swipe'.
      * Returns true if the attack was performed - for example, the
      * player was not on cooldown and had a valid target. Target
      * selection is performed by raycasting from the player's head.
      * @throws This function can throw errors.
      */
    def attack(): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to attack the provided target.
      * Returns true if the attack was performed - for example, the
      * player was not on cooldown and had a valid target. The
      * attack can be performed at any distance and does not require
      * line of sight to the target entity.
      * @param entity
      * @throws This function can throw errors.
      */
    def attackEntity(entity: Entity): Boolean = js.native
    
    /**
      * @remarks
      * Destroys the block at blockLocation, respecting the rules of
      * the server player's game mode. The block will be hit until
      * broken, an item is used or stopBreakingBlock is called.
      * Returns true if the block at blockLocation is solid.
      * @param blockLocation
      * Location of the block to interact with.
      * @param direction
      * Direction to place the specified item within.
      * @throws This function can throw errors.
      */
    def breakBlock(blockLocation: BlockLocation): Boolean = js.native
    def breakBlock(blockLocation: BlockLocation, direction: Direction): Boolean = js.native
    
    /**
      * @remarks
      * Gives the simulated player a particular item stack.
      * @param itemStack
      * Item to give.
      * @param selectSlot
      * Whether to set the selected slot once given.
      * @throws This function can throw errors.
      */
    def giveItem(itemStack: ItemStack): Boolean = js.native
    def giveItem(itemStack: ItemStack, selectSlot: Boolean): Boolean = js.native
    
    /**
      * Rotation of the head across pitch and yaw angles.
      * @throws This property can throw when used.
      */
    val headRotation: XYRotation = js.native
    
    /**
      * @remarks
      * Performs a raycast from the player’s head and interacts with
      * the first intersected block or entity. Returns true if the
      * interaction was successful. Maximum range is 6 blocks.
      * @throws This function can throw errors.
      */
    def interact(): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to interact with a block. The
      * block at the specified block location must be solid. Returns
      * true if the interaction was performed.
      * @param blockLocation
      * Location of the block to interact with.
      * @param direction
      * Direction to place the specified item within.
      * @throws This function can throw errors.
      */
    def interactWithBlock(blockLocation: BlockLocation): Boolean = js.native
    def interactWithBlock(blockLocation: BlockLocation, direction: Direction): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to interact with a mob. Returns
      * true if the interaction was performed.
      * @param entity
      * Entity to interact with.
      * @throws This function can throw errors.
      */
    def interactWithEntity(entity: Entity): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to jump.
      * @returns
      * True if a jump was performed.
      * @throws This function can throw errors.
      */
    def jump(): Boolean = js.native
    
    /**
      * @remarks
      * Rotates the simulated player's head/body to look at the
      * given block location.
      * @param blockLocation
      * @throws This function can throw errors.
      */
    def lookAtBlock(blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * Rotates the simulated player's head/body to look at the
      * given entity.
      * @param entity
      * @throws This function can throw errors.
      */
    def lookAtEntity(entity: Entity): Unit = js.native
    
    /**
      * @remarks
      * Rotates the simulated player's head/body to look at the
      * given location.
      * @param location
      * @throws This function can throw errors.
      */
    def lookAtLocation(location: Location): Unit = js.native
    
    /**
      * @remarks
      * Orders the simulated player to walk in the given direction
      * relative to the GameTest.
      * @param westEast
      * @param northSouth
      * @param speed
      * @throws This function can throw errors.
      */
    def move(westEast: Double, northSouth: Double): Unit = js.native
    def move(westEast: Double, northSouth: Double, speed: Double): Unit = js.native
    
    /**
      * @remarks
      * Orders the simulated player to walk in the given direction
      * relative to the player's current rotation.
      * @param leftRight
      * @param backwardForward
      * @param speed
      * @throws This function can throw errors.
      */
    def moveRelative(leftRight: Double, backwardForward: Double): Unit = js.native
    def moveRelative(leftRight: Double, backwardForward: Double, speed: Double): Unit = js.native
    
    /**
      * @remarks
      * Orders the simulated player to move to the given block
      * location in a straight line. If a move or navigation is
      * already playing, this will override the last
      * move/navigation.
      * @param blockLocation
      * @param speed
      * @throws This function can throw errors.
      */
    def moveToBlock(blockLocation: BlockLocation): Unit = js.native
    def moveToBlock(blockLocation: BlockLocation, speed: Double): Unit = js.native
    
    /**
      * @remarks
      * Orders the simulated player to move to the given location in
      * a straight line. If a move or navigation is already playing,
      * this will override the last move/navigation.
      * @param location
      * @param speed
      * @throws This function can throw errors.
      */
    def moveToLocation(location: Location): Unit = js.native
    def moveToLocation(location: Location, speed: Double): Unit = js.native
    
    /**
      * @remarks
      * Orders the simulated player to move to a specific block
      * location using navigation. If a move or navigation is
      * already playing, this will override the last move/walk. Note
      * that if the simulated player gets stuck, that simulated
      * player will stop. The player must be touching the ground in
      * order to start navigation.
      * @param blockLocation
      * @param speed
      * @throws This function can throw errors.
      */
    def navigateToBlock(blockLocation: BlockLocation): NavigationResult = js.native
    def navigateToBlock(blockLocation: BlockLocation, speed: Double): NavigationResult = js.native
    
    /**
      * @remarks
      * Will use navigation to follow the selected entity to within
      * a one block radius. If a move or navigation is already
      * playing, this will override the last move/navigation.
      * @param entity
      * @param speed
      * @throws This function can throw errors.
      */
    def navigateToEntity(entity: Entity): NavigationResult = js.native
    def navigateToEntity(entity: Entity, speed: Double): NavigationResult = js.native
    
    /**
      * @remarks
      * Orders the simulated player to move to a specific location
      * using navigation. If a move or navigation is already
      * playing, this will override the last move/walk. Note that if
      * the simulated player gets stuck, that simulated player will
      * stop. The player must be touching the ground in order to
      * start navigation.
      * @param location
      * @param speed
      * @throws This function can throw errors.
      */
    def navigateToLocation(location: Location): NavigationResult = js.native
    def navigateToLocation(location: Location, speed: Double): NavigationResult = js.native
    
    /**
      * @remarks
      * Use navigation to follow the route provided via the
      * locations parameter. If a move or navigation is already
      * playing, this will override the last move/navigation.
      * @param locations
      * A list of locations to use for routing.
      * @param speed
      * Net speed to use for doing the navigation.
      * @throws This function can throw errors.
      */
    def navigateToLocations(locations: js.Array[Location]): Unit = js.native
    def navigateToLocations(locations: js.Array[Location], speed: Double): Unit = js.native
    
    def postClientMessage(id: String, value: String): Unit = js.native
    
    /**
      * @remarks
      * Causes the simulated player to turn by the provided angle,
      * relative to the player's current rotation.
      * @param angleInDegrees
      * @throws This function can throw errors.
      */
    def rotateBody(angleInDegrees: Double): Unit = js.native
    
    /**
      * @remarks
      * Causes the simulated player to turn to face the provided
      * angle, relative to the GameTest.
      * @param angleInDegrees
      * @throws This function can throw errors.
      */
    def setBodyRotation(angleInDegrees: Double): Unit = js.native
    
    /**
      * @remarks
      * Sets the game mode that the simulated player is operating
      * under.
      * @param gameMode
      * Game mode to set.
      * @throws This function can throw errors.
      */
    def setGameMode(gameMode: GameMode): Unit = js.native
    
    /**
      * @remarks
      * Sets a particular item for the simulated player.
      * @param itemStack
      * Item to set.
      * @param slot
      * Slot to place the given item in.
      * @param selectSlot
      * Whether to set the selected slot once set.
      * @throws This function can throw errors.
      */
    def setItem(itemStack: ItemStack, slot: Double): Boolean = js.native
    def setItem(itemStack: ItemStack, slot: Double, selectSlot: Boolean): Boolean = js.native
    
    /**
      * @remarks
      * Stops destroying the block that is currently being hit.
      * @throws This function can throw errors.
      */
    def stopBreakingBlock(): Unit = js.native
    
    /**
      * @remarks
      * Stops interacting with entities or blocks.
      * @throws This function can throw errors.
      */
    def stopInteracting(): Unit = js.native
    
    /**
      * @remarks
      * Stops moving/walking/following if the simulated player is
      * moving.
      * @throws This function can throw errors.
      */
    def stopMoving(): Unit = js.native
    
    /**
      * @remarks
      * Stops using the currently active item.
      * @throws This function can throw errors.
      */
    def stopUsingItem(): Unit = js.native
    
    /**
      * @remarks
      * Causes the simulated player to use an item. Does not consume
      * the item. Returns false if the item is on cooldown.
      * @param itemStack
      * Item to use.
      * @throws This function can throw errors.
      */
    def useItem(itemStack: ItemStack): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to hold and use an item in their
      * inventory.
      * @param slot
      * Index of the inventory slot.
      * @throws This function can throw errors.
      */
    def useItemInSlot(slot: Double): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to use an item in their
      * inventory on a block. The block at the specified block
      * location must be solid. Returns true if the item was used.
      * @param slot
      * Index of the slot to use.
      * @param blockLocation
      * Location to use the item upon.
      * @param direction
      * Direction to place the specified item within.
      * @param faceLocationX
      * Block-face-relative X position where to place the item.
      * @param faceLocationY
      * Block-face-relative Y position where to place the item.
      * @throws This function can throw errors.
      */
    def useItemInSlotOnBlock(slot: Double, blockLocation: BlockLocation): Boolean = js.native
    def useItemInSlotOnBlock(slot: Double, blockLocation: BlockLocation, direction: Unit, faceLocationX: Double): Boolean = js.native
    def useItemInSlotOnBlock(
      slot: Double,
      blockLocation: BlockLocation,
      direction: Unit,
      faceLocationX: Double,
      faceLocationY: Double
    ): Boolean = js.native
    def useItemInSlotOnBlock(
      slot: Double,
      blockLocation: BlockLocation,
      direction: Unit,
      faceLocationX: Unit,
      faceLocationY: Double
    ): Boolean = js.native
    def useItemInSlotOnBlock(slot: Double, blockLocation: BlockLocation, direction: Direction): Boolean = js.native
    def useItemInSlotOnBlock(slot: Double, blockLocation: BlockLocation, direction: Direction, faceLocationX: Double): Boolean = js.native
    def useItemInSlotOnBlock(
      slot: Double,
      blockLocation: BlockLocation,
      direction: Direction,
      faceLocationX: Double,
      faceLocationY: Double
    ): Boolean = js.native
    def useItemInSlotOnBlock(
      slot: Double,
      blockLocation: BlockLocation,
      direction: Direction,
      faceLocationX: Unit,
      faceLocationY: Double
    ): Boolean = js.native
    
    /**
      * @remarks
      * Causes the simulated player to use an item on a block. The
      * block at the specified block location must be solid. Returns
      * true if the item was used.
      * @param itemStack
      * Item to use.
      * @param blockLocation
      * Location to use the item upon.
      * @param direction
      * Direction to place the specified item within.
      * @param faceLocationX
      * Block-face-relative X position where to place the item.
      * @param faceLocationY
      * Block-face-relative Y position where to place the item.
      * @throws This function can throw errors.
      */
    def useItemOnBlock(itemStack: ItemStack, blockLocation: BlockLocation): Boolean = js.native
    def useItemOnBlock(itemStack: ItemStack, blockLocation: BlockLocation, direction: Unit, faceLocationX: Double): Boolean = js.native
    def useItemOnBlock(
      itemStack: ItemStack,
      blockLocation: BlockLocation,
      direction: Unit,
      faceLocationX: Double,
      faceLocationY: Double
    ): Boolean = js.native
    def useItemOnBlock(
      itemStack: ItemStack,
      blockLocation: BlockLocation,
      direction: Unit,
      faceLocationX: Unit,
      faceLocationY: Double
    ): Boolean = js.native
    def useItemOnBlock(itemStack: ItemStack, blockLocation: BlockLocation, direction: Direction): Boolean = js.native
    def useItemOnBlock(itemStack: ItemStack, blockLocation: BlockLocation, direction: Direction, faceLocationX: Double): Boolean = js.native
    def useItemOnBlock(
      itemStack: ItemStack,
      blockLocation: BlockLocation,
      direction: Direction,
      faceLocationX: Double,
      faceLocationY: Double
    ): Boolean = js.native
    def useItemOnBlock(
      itemStack: ItemStack,
      blockLocation: BlockLocation,
      direction: Direction,
      faceLocationX: Unit,
      faceLocationY: Double
    ): Boolean = js.native
  }
  
  @JSImport("mojang-gametest", "Tags")
  @js.native
  /* protected */ open class Tags () extends StObject
  /* static members */
  object Tags {
    
    /**
      * Indicates that the tagged test should be a part of all
      * suites.
      */
    @JSImport("mojang-gametest", "Tags.suiteAll")
    @js.native
    val suiteAll: /* "suite:all" */ String = js.native
    
    /**
      * Indicates that the tagged test should be a part of an
      * internal (debug) test suite.
      */
    @JSImport("mojang-gametest", "Tags.suiteDebug")
    @js.native
    val suiteDebug: /* "suite:debug" */ String = js.native
    
    /**
      * Indicates that the tagged test should be a part of the
      * default test suite.
      */
    @JSImport("mojang-gametest", "Tags.suiteDefault")
    @js.native
    val suiteDefault: /* "suite:default" */ String = js.native
    
    /**
      * Indicates that the tagged test should be a part of a suite
      * of disabled tests.
      */
    @JSImport("mojang-gametest", "Tags.suiteDisabled")
    @js.native
    val suiteDisabled: /* "suite:disabled" */ String = js.native
  }
  
  @JSImport("mojang-gametest", "Test")
  @js.native
  /* protected */ open class Test () extends StObject {
    
    /**
      * @remarks
      * Tests that the condition specified in _condition_ is true.
      * If not, an error with the specified _message_ is thrown.
      * @param condition
      * Expression of the condition to evaluate.
      * @param message
      * Message that is passed if the _condition_ does not evaluate
      * to true.
      * @throws This function can throw errors.
      */
    def assert(condition: Boolean, message: String): Unit = js.native
    
    /**
      * @remarks
      * Tests that a block of the specified type is present at the
      * specified location. If it is not, an exception is thrown.
      * @param blockType
      * Expected block type.
      * @param blockLocation
      * Location of the block to test at.
      * @param isPresent
      * If true, this function tests whether a block of the
      * specified type is at the location. If false, tests that a
      * block of the specified type is not present.
      * @throws This function can throw errors.
      */
    def assertBlockPresent(blockType: BlockType, blockLocation: BlockLocation): Unit = js.native
    def assertBlockPresent(blockType: BlockType, blockLocation: BlockLocation, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests that a block has a particular state value at the
      * specified location. If it does not have that state value, an
      * exception is thrown.
      * @param blockLocation
      * Location of the block to test at.
      * @param callback
      * Callback function that contains additional tests based on
      * the block at the specified location.
      * @throws This function can throw errors.
      * @example testIfButtonNotPressed.js
      * ```typescript
      *        test.assertBlockState(buttonPos, (block) => {
      *          return block.permutation.getProperty("button_pressed_bit") == 0;
      *        });
      *
      * ```
      */
    def assertBlockState(blockLocation: BlockLocation, callback: js.Function1[/* arg */ Block, Boolean]): Unit = js.native
    
    /**
      * @remarks
      * Tests that an entity can reach a particular location.
      * Depending on the value of canReach, throws an exception if
      * the condition is not met.
      * @param mob
      * Entity that you wish to test the location against.
      * @param blockLocation
      * Structure-relative location to test whether the specified
      * mob can reach.
      * @param canReach
      * If true, tests whether the mob can reach the location. If
      * false, tests whether the mob is not able to reach the
      * location.
      * @throws This function can throw errors.
      */
    def assertCanReachLocation(mob: Entity, blockLocation: BlockLocation): Unit = js.native
    def assertCanReachLocation(mob: Entity, blockLocation: BlockLocation, canReach: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests that a container (e.g., a chest) at the specified
      * location contains a specified of item stack. If not, an
      * error is thrown.
      * @param itemStack
      * Represents the type of item to check for. The specified
      * container must contain at least 1 item matching the item
      * type defined in _itemStack_.
      * @param blockLocation
      * Location of the block with a container (for example, a
      * chest) to test the contents of.
      * @throws This function can throw errors.
      */
    def assertContainerContains(itemStack: ItemStack, blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * Tests that a container (e.g., a chest) at the specified
      * location is empty. If not, an error is thrown.
      * @param blockLocation
      * Location of the block with a container (for example, a
      * chest) to test is empty of contents.
      * @throws This function can throw errors.
      */
    def assertContainerEmpty(blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * Tests that an entity has a specific piece of armor equipped.
      * If not, an error is thrown.
      * @param entityTypeIdentifier
      * Identifier of the entity to match (e.g.,
      * 'minecraft:skeleton').
      * @param armorSlot
      * Container slot index to test.
      * @param armorName
      * Name of the armor to look for.
      * @param armorData
      * Data value integer to look for.
      * @param blockLocation
      * Location of the entity with armor to test for.
      * @param hasArmor
      * Whether or not the entity is expected to have the specified
      * armor equipped.
      * @throws This function can throw errors.
      * @example horseArmorTest.js
      * ```typescript
      *        test.assertEntityHasArmor("minecraft:horse", armorSlotTorso, "diamond_horse_armor", 0, horseLocation, true);
      *
      * ```
      */
    def assertEntityHasArmor(
      entityTypeIdentifier: String,
      armorSlot: Double,
      armorName: String,
      armorData: Double,
      blockLocation: BlockLocation
    ): Unit = js.native
    def assertEntityHasArmor(
      entityTypeIdentifier: String,
      armorSlot: Double,
      armorName: String,
      armorData: Double,
      blockLocation: BlockLocation,
      hasArmor: Boolean
    ): Unit = js.native
    
    /**
      * @remarks
      * Tests that an entity has a particular component. If not, an
      * exception is thrown.
      * @param entityTypeIdentifier
      * Identifier of the specified entity (e.g.,
      * 'minecraft:skeleton'). If the namespace is not specified,
      * 'minecraft:' is assumed.
      * @param componentIdentifier
      * Identifier of the component to check for. If the namespace
      * is not specified, 'minecraft:' is assumed.
      * @param blockLocation
      * Location of the block with a container (for example, a
      * chest.)
      * @param hasComponent
      * Determines whether to test that the component exists, or
      * does not.
      * @throws This function can throw errors.
      * @example sheepShearedTest.js
      * ```typescript
      *        test.assertEntityHasComponent("minecraft:sheep", "minecraft:is_sheared", entityLoc, false);
      *
      * ```
      */
    def assertEntityHasComponent(entityTypeIdentifier: String, componentIdentifier: String, blockLocation: BlockLocation): Unit = js.native
    def assertEntityHasComponent(
      entityTypeIdentifier: String,
      componentIdentifier: String,
      blockLocation: BlockLocation,
      hasComponent: Boolean
    ): Unit = js.native
    
    /**
      * @remarks
      * Depending on the value for isPresent, tests that a
      * particular entity is present or not present at the specified
      * location. Depending on the value of isPresent, if the entity
      * is found or not found, an error is thrown.
      * @param entity
      * Specific entity to test for.
      * @param blockLocation
      * Location of the entity to test for.
      * @param isPresent
      * Whether to test that an entity is present or not present at
      * the specified location.
      * @throws This function can throw errors.
      */
    def assertEntityInstancePresent(entity: Entity, blockLocation: BlockLocation): Unit = js.native
    def assertEntityInstancePresent(entity: Entity, blockLocation: BlockLocation, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Depending on the value of isPresent, tests for the presence
      * or non-presence of entity of a specified type at a
      * particular location. If the condition is not met, an
      * exception is thrown.
      * @param entityTypeIdentifier
      * Type of entity to test for (e.g., 'minecraft:skeleton'). If
      * an entity namespace is not specified, 'minecraft:' is
      * assumed.
      * @param blockLocation
      * Location of the entity to test for.
      * @param isPresent
      * If true, this function tests whether an entity of the
      * specified type is present. If false, tests that an entity of
      * the specified type is not present.
      * @throws This function can throw errors.
      */
    def assertEntityPresent(entityTypeIdentifier: String, blockLocation: BlockLocation): Unit = js.native
    def assertEntityPresent(entityTypeIdentifier: String, blockLocation: BlockLocation, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests that an entity of a specified type is present within
      * the GameTest area. If not, an exception is thrown.
      * @param entityTypeIdentifier
      * Type of entity to test for (e.g., 'minecraft:skeleton'). If
      * an entity namespace is not specified, 'minecraft:' is
      * assumed.
      * @param isPresent
      * If true, this function tests whether an entity of the
      * specified type is present in the GameTest area. If false,
      * tests that an entity of the specified type is not present.
      * @throws This function can throw errors.
      * @example simpleMobTest.ts
      * ```typescript
      *          gt.register("StarterTests", "simpleMobTest", (test: gt.Test) => {
      *            const attackerId = "fox";
      *            const victimId = "chicken";
      *
      *            test.spawn(attackerId, new mc.BlockLocation(5, 2, 5));
      *            test.spawn(victimId, new mc.BlockLocation(2, 2, 2));
      *
      *            test.assertEntityPresentInArea(victimId, true);
      *
      *            test.succeedWhen(() => {
      *              test.assertEntityPresentInArea(victimId, false);
      *            });
      *          })
      *            .maxTicks(400)
      *            .structureName("gametests:mediumglass");
      * ```
      */
    def assertEntityPresentInArea(entityTypeIdentifier: String): Unit = js.native
    def assertEntityPresentInArea(entityTypeIdentifier: String, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests that an entity (e.g., a skeleton) at the specified
      * location has a particular piece of data. If not, an error is
      * thrown.
      * @param blockLocation
      * Location of the entity to look for.
      * @param entityTypeIdentifier
      * Identifier of the entity (e.g., 'minecraft:skeleton') to
      * look for. Note if no namespace is specified, 'minecraft:' is
      * assumed.
      * @param callback
      * Callback function where facets of the selected entity can be
      * tested for. If this callback function returns false or no
      * entity with the specified identifier is found, an exception
      * is thrown.
      * @throws This function can throw errors.
      * @example villagerEffectTest.js
      * ```typescript
      *        test.assertEntityState(
      *          villagerPos,
      *          "minecraft:villager_v2",
      *          (entity) => entity.getEffect(MinecraftEffectTypes.regeneration).duration > 120
      *        ); // At least 6 seconds remaining in the villagers' effect
      *
      * ```
      */
    def assertEntityState(
      blockLocation: BlockLocation,
      entityTypeIdentifier: String,
      callback: js.Function1[/* arg */ Entity, Boolean]
    ): Unit = js.native
    
    /**
      * @remarks
      * Depending on the value of isTouching, tests that an entity
      * of a specified type is touching or connected to another
      * entity. If the condition is not met, an exception is thrown.
      * @param entityTypeIdentifier
      * Type of entity to test for (e.g., 'minecraft:skeleton'). If
      * an entity namespace is not specified, 'minecraft:' is
      * assumed.
      * @param location
      * Location of the entity to test for.
      * @param isTouching
      * If true, this function tests whether the entity is touching
      * the specified location. If false, tests that an entity is
      * not testing the specified location.
      * @throws This function can throw errors.
      */
    def assertEntityTouching(entityTypeIdentifier: String, location: Location): Unit = js.native
    def assertEntityTouching(entityTypeIdentifier: String, location: Location, isTouching: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Depending on the value of isWaterlogged, tests that a block
      * at a location contains water. If the condition is not met,
      * an error is thrown. Pure water blocks are not considered to
      * be waterlogged.
      * @param blockLocation
      * Location of the block to test for.
      * @param isWaterlogged
      * Whether to test that the block at _position_ is expected to
      * be waterlogged.
      * @throws This function can throw errors.
      */
    def assertIsWaterlogged(blockLocation: BlockLocation): Unit = js.native
    def assertIsWaterlogged(blockLocation: BlockLocation, isWaterlogged: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests that items of a particular type and count are present
      * within an area. If not, an error is thrown.
      * @param itemType
      * Type of item to look for.
      * @param blockLocation
      * Location to search around for the specified set of items.
      * @param searchDistance
      * Range, in blocks, to aggregate a count of items around. If
      * 0, will only search the particular block at _position_.
      * @param count
      * Number of items, at minimum, to look and test for.
      * @throws This function can throw errors.
      * @example findFeathers.js
      * ```typescript
      *        test.assertItemEntityCountIs(Items.feather, expectedFeatherLoc, 0, 1);
      *
      * ```
      */
    def assertItemEntityCountIs(itemType: ItemType, blockLocation: BlockLocation, searchDistance: Double, count: Double): Unit = js.native
    
    /**
      * @remarks
      * Depending on the value of isPresent, tests whether a
      * particular item entity is present or not at a particular
      * location. If the condition is not met, an exception is
      * thrown.
      * @param itemType
      * Type of item to test for.
      * @param blockLocation
      * Location of the item entity to test for.
      * @param searchDistance
      * Radius in blocks to look for the item entity.
      * @param isPresent
      * If true, this function tests whether an item entity of the
      * specified type is present. If false, tests that an item
      * entity of the specified type is not present.
      * @throws This function can throw errors.
      */
    def assertItemEntityPresent(itemType: ItemType, blockLocation: BlockLocation, searchDistance: Double): Unit = js.native
    def assertItemEntityPresent(itemType: ItemType, blockLocation: BlockLocation, searchDistance: Double, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests that Redstone power at a particular location matches a
      * particular value. If not, an exception is thrown.
      * @param blockLocation
      * Location to test.
      * @param power
      * Expected power level.
      * @throws This function can throw errors.
      */
    def assertRedstonePower(blockLocation: BlockLocation, power: Double): Unit = js.native
    
    def destroyBlock(blockLocation: BlockLocation): Unit = js.native
    def destroyBlock(blockLocation: BlockLocation, dropResources: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Marks the current test as a failure case.
      * @param errorMessage
      * Error message summarizing the failure condition.
      * @throws This function can throw errors.
      */
    def fail(errorMessage: String): Unit = js.native
    
    /**
      * @remarks
      * Runs the given callback. If the callback does not throw an
      * exception, the test is marked as a failure.
      * @param callback
      * Callback function that runs. If the function runs
      * successfully, the test is marked as a failure. Typically,
      * this function will have .assertXyz method calls within it.
      * @throws This function can throw errors.
      */
    def failIf(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @remarks
      * Gets a block at the specified block location.
      * @param blockLocation
      * Location of the block to retrieve.
      * @throws This function can throw errors.
      */
    def getBlock(blockLocation: BlockLocation): Block = js.native
    
    /**
      * @remarks
      * Gets the dimension of this test.
      * @throws This function can throw errors.
      */
    def getDimension(): Dimension = js.native
    
    /**
      * @remarks
      * If the block at the specified block location is a fence,
      * this returns a helper object with details on how a fence is
      * connected.
      * @param blockLocation
      * Location of the block to retrieve.
      * @throws This function can throw errors.
      */
    def getFenceConnectivity(blockLocation: BlockLocation): FenceConnectivity = js.native
    
    /**
      * @remarks
      * Retrieves a sculk spreader object that can be used to
      * control and manage how sculk grows from a block.
      * @param blockLocation
      * Location of the block to retrieve a sculk spreader from.
      * @throws This function can throw errors.
      */
    def getSculkSpreader(blockLocation: BlockLocation): SculkSpreader = js.native
    
    /**
      * @remarks
      * Returns the direction of the current test - see the
      * {@link mojang-minecraft}.Direction enum for more information on
      * potential values (north, east, south, west - values 2-5).
      */
    def getTestDirection(): Direction = js.native
    
    /**
      * @remarks
      * This asynchronous function will wait for the specified time
      * in ticks before continuing execution.
      * @param tickDelay
      * Amount of time to wait, in ticks.
      */
    def idle(tickDelay: Double): js.Promise[Unit] = js.native
    
    /**
      * @remarks
      * Kills all entities within the GameTest structure.
      * @throws This function can throw errors.
      */
    def killAllEntities(): Unit = js.native
    
    /**
      * @remarks
      * Presses a button at a block location.
      * @param blockLocation
      * Location to push the button at.
      * @throws
      * Will throw an error if a button is not present at the
      * specified position.
      */
    def pressButton(blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * Displays the specified message to all players.
      * @param text
      * Message to display.
      * @throws This function can throw errors.
      */
    def print(text: String): Unit = js.native
    
    /**
      * @remarks
      * Pulls a lever at a block location.
      * @param blockLocation
      * Location to pull the lever at.
      * @throws
      * Will throw an error if a lever is not present at the
      * specified position.
      */
    def pullLever(blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * Sends a Redstone pulse at a particular location by creating
      * a temporary Redstone block.
      * @param blockLocation
      * Location to pulse Redstone at.
      * @param duration
      * Number of ticks to pulse Redstone.
      * @throws This function can throw errors.
      */
    def pulseRedstone(blockLocation: BlockLocation, duration: Double): Unit = js.native
    
    /**
      * @remarks
      * From a BlockLocation, returns a new BlockLocation with
      * coordinates relative to the current GameTest structure
      * block. For example, the relative coordinates for the block
      * above the structure block are (0, 1, 0). Rotation of the
      * GameTest structure is also taken into account.
      * @param worldBlockLocation
      * Absolute location in the world to convert to a relative
      * location.
      * @returns
      * A location relative to the GameTest command block.
      * @throws This function can throw errors.
      */
    def relativeBlockLocation(worldBlockLocation: BlockLocation): BlockLocation = js.native
    
    /**
      * @remarks
      * From a location, returns a new location with coordinates
      * relative to the current GameTest structure block. For
      * example, the relative coordinates for the block above the
      * structure block are (0, 1, 0). Rotation of the GameTest
      * structure is also taken into account.
      * @param worldLocation
      * Absolute location in the world to convert to a relative
      * location.
      * @returns
      * A location relative to the GameTest command block.
      * @throws This function can throw errors.
      */
    def relativeLocation(worldLocation: Location): Location = js.native
    
    /**
      * @remarks
      * Removes a simulated player from the world.
      * @param simulatedPlayer
      * Simulated player to remove.
      */
    def removeSimulatedPlayer(simulatedPlayer: SimulatedPlayer): Unit = js.native
    
    /**
      * @remarks
      * Returns a relative direction given the current rotation of
      * the current test. Passing in Direction.south will return the
      * test direction; Passing in Direction.north will return the
      * opposite of the test direction, and so on.
      * @param direction
      * Direction to translate into a direction relative to the
      * GameTest facing. Passing in Direction.south will return the
      * test direction; Passing in Direction.north will return the
      * opposite of the test direction, and so on.
      * @throws This function can throw errors.
      */
    def rotateDirection(direction: Direction): Direction = js.native
    
    def rotateVector(vector: Vector): Vector = js.native
    
    /**
      * @remarks
      * Runs a specific callback after a specified delay of ticks
      * @param delayTicks
      * Number of ticks to delay before running the specified
      * callback.
      * @param callback
      * Callback function to execute.
      * @throws This function can throw errors.
      */
    def runAfterDelay(delayTicks: Double, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @remarks
      * Runs the given callback after a delay of _tick_ ticks from
      * the start of the GameTest.
      * @param tick
      * Tick (after the start of the GameTest) to run the callback
      * at.
      * @param callback
      * Callback function to execute.
      * @throws This function can throw errors.
      */
    def runAtTickTime(tick: Double, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @remarks
      * Sets a block to a particular configuration (a
      * BlockPermutation) at the specified block location.
      * @param blockData
      * Permutation that contains the configuration data for a
      * block.
      * @param blockLocation
      * Location of the block to set.
      * @throws This function can throw errors.
      */
    def setBlockPermutation(blockData: BlockPermutation, blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * Sets a block to a particular type at the specified block
      * location.
      * @param blockType
      * Type of block to set.
      * @param blockLocation
      * Location of the block to set.
      * @throws This function can throw errors.
      */
    def setBlockType(blockType: BlockType, blockLocation: BlockLocation): Unit = js.native
    
    /**
      * @remarks
      * For blocks that are fluid containers - like a cauldron -
      * changes the type of fluid within that container.
      * @param location
      * Location of the fluid container block.
      * @param type
      * Type of fluid to set. See {@link mojang-gametest}.FluidType for a
      * list of values.
      * @throws This function can throw errors.
      */
    def setFluidContainer(location: BlockLocation, `type`: FluidType): Unit = js.native
    
    /**
      * @remarks
      * Sets the fuse of an explodable entity.
      * @param entity
      * Entity that is explodable.
      * @param fuseLength
      * Length of time, in ticks, before the entity explodes.
      * @throws This function can throw errors.
      */
    def setTntFuse(entity: Entity, fuseLength: Double): Unit = js.native
    
    /**
      * @remarks
      * Spawns an entity at a location.
      * @param entityTypeIdentifier
      * Type of entity to create. If no namespace is provided,
      * 'minecraft:' is assumed. Note that an optional initial spawn
      * event can be specified between less than/greater than signs
      * (e.g., namespace:entityType<spawnEvent>).
      * @param blockLocation
      * @returns
      * The spawned entity. If the entity cannot be spawned, returns
      * undefined.
      * @throws This function can throw errors.
      * @example simpleMobTest.ts
      * ```typescript
      *          gt.register("StarterTests", "simpleMobTest", (test: gt.Test) => {
      *            const attackerId = "fox";
      *            const victimId = "chicken";
      *
      *            test.spawn(attackerId, new mc.BlockLocation(5, 2, 5));
      *            test.spawn(victimId, new mc.BlockLocation(2, 2, 2));
      *
      *            test.assertEntityPresentInArea(victimId, true);
      *
      *            test.succeedWhen(() => {
      *              test.assertEntityPresentInArea(victimId, false);
      *            });
      *          })
      *            .maxTicks(400)
      *            .structureName("gametests:mediumglass");
      * ```
      * @example spawnAdultPig.js
      * ```typescript
      *        test.spawn("minecraft:pig<minecraft:ageable_grow_up>", new BlockLocation(1, 2, 1));
      *
      * ```
      */
    def spawn(entityTypeIdentifier: String, blockLocation: BlockLocation): Entity = js.native
    
    /**
      * @remarks
      * Spawns an entity at a location.
      * @param entityTypeIdentifier
      * Type of entity to create. If no namespace is provided,
      * 'minecraft:' is assumed. Note that an optional initial spawn
      * event can be specified between less than/greater than signs
      * (e.g., namespace:entityType<spawnEvent>).
      * @param location
      * @returns
      * The spawned entity. If the entity cannot be spawned, returns
      * undefined.
      * @throws This function can throw errors.
      * @example spawnAdultPig.js
      * ```typescript
      *        test.spawn("minecraft:pig<minecraft:ageable_grow_up>", new Location(1.5, 2, 1.5));
      * ```
      */
    def spawnAtLocation(entityTypeIdentifier: String, location: Location): Entity = js.native
    
    /**
      * @remarks
      * Spawns an item entity at a specified location.
      * @param itemStack
      * ItemStack that describes the item entity to create.
      * @param location
      * Location to create the item entity at.
      * @throws This function can throw errors.
      * @example spawnEmeralds.js
      * ```typescript
      *        const oneEmerald = new ItemStack(MinecraftItemTypes.emerald, 1, 0);
      *        const fiveEmeralds = new ItemStack(MinecraftItemTypes.emerald, 5, 0);
      *
      *        test.spawnItem(oneEmerald, new Location(3.5, 3, 1.5));
      *        test.spawnItem(fiveEmeralds, new Location(1.5, 3, 1.5));
      *
      * ```
      */
    def spawnItem(itemStack: ItemStack, location: Location): Entity = js.native
    
    /**
      * @remarks
      * Creates a new simulated player within the world.
      * @param blockLocation
      * Location where to spawn the simulated player.
      * @param name
      * Name to give the new simulated player.
      * @param gameMode
      * @throws This function can throw errors.
      */
    def spawnSimulatedPlayer(blockLocation: BlockLocation): SimulatedPlayer = js.native
    def spawnSimulatedPlayer(blockLocation: BlockLocation, name: String): SimulatedPlayer = js.native
    def spawnSimulatedPlayer(blockLocation: BlockLocation, name: String, gameMode: GameMode): SimulatedPlayer = js.native
    def spawnSimulatedPlayer(blockLocation: BlockLocation, name: Unit, gameMode: GameMode): SimulatedPlayer = js.native
    
    /**
      * @remarks
      * Spawns an entity at a location without any AI behaviors.
      * This method is frequently used in conjunction with methods
      * like .walkTo to create predictable mob actions.
      * @param entityTypeIdentifier
      * @param blockLocation
      * Location where the entity should be spawned.
      * @throws This function can throw errors.
      */
    def spawnWithoutBehaviors(entityTypeIdentifier: String, blockLocation: BlockLocation): Entity = js.native
    
    /**
      * @remarks
      * Spawns an entity at a location without any AI behaviors.
      * This method is frequently used in conjunction with methods
      * like .walkTo to create predictable mob actions.
      * @param entityTypeIdentifier
      * @param location
      * Location where the entity should be spawned.
      * @throws This function can throw errors.
      */
    def spawnWithoutBehaviorsAtLocation(entityTypeIdentifier: String, location: Location): Entity = js.native
    
    /**
      * @remarks
      * Tests that a particular item entity is present at a
      * particular location. If not, an exception is thrown.
      * @param blockLocation
      * BlockLocation containing a multiface block.
      * @param fromFace
      * Face to spread from. This face must already be set.
      * @param direction
      * Direction to spread. Use the Minecraft.Direction enum to
      * specify a direction.
      * @throws This function can throw errors.
      * @example spreadFromFaceTowardDirection.js
      * ```typescript
      *        test.spreadFromFaceTowardDirection(new BlockLocation(1, 2, 1), Direction.south, Direction.down);
      * ```
      */
    def spreadFromFaceTowardDirection(blockLocation: BlockLocation, fromFace: Direction, direction: Direction): Unit = js.native
    
    /**
      * @remarks
      * Creates a new GameTestSequence - A set of steps that play
      * out sequentially within a GameTest.
      * @returns
      * A new GameTestSequence with chaining methods that facilitate
      * creating a set of steps.
      */
    def startSequence(): GameTestSequence = js.native
    
    /**
      * @remarks
      * Marks the current test as a success case.
      * @throws This function can throw errors.
      */
    def succeed(): Unit = js.native
    
    /**
      * @remarks
      * Runs the given callback. If the callback does not throw an
      * exception, the test is marked as a success.
      * @param callback
      * Callback function that runs. If the function runs
      * successfully, the test is marked as a success. Typically,
      * this function will have .assertXyz method calls within it.
      * @throws This function can throw errors.
      */
    def succeedIf(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @remarks
      * Marks the test as a success at the specified tick.
      * @param tick
      * Tick after the start of the GameTest to mark the test as
      * successful.
      * @throws This function can throw errors.
      */
    def succeedOnTick(tick: Double): Unit = js.native
    
    /**
      * @remarks
      * Runs the given callback at _tick_ ticks after the start of
      * the test. If the callback does not throw an exception, the
      * test is marked as a failure.
      * @param tick
      * Tick after the start of the GameTest to run the testing
      * callback at.
      * @param callback
      * Callback function that runs. If the function runs
      * successfully, the test is marked as a success.
      * @throws This function can throw errors.
      */
    def succeedOnTickWhen(tick: Double, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @remarks
      * Runs the given callback every tick. When the callback
      * successfully executes, the test is marked as a success.
      * Specifically, the test will succeed when the callback does
      * not throw an exception.
      * @param callback
      * Testing callback function that runs. If the function runs
      * successfully, the test is marked as a success.
      * @throws This function can throw errors.
      * @example simpleMobTest.ts
      * ```typescript
      *          gt.register("StarterTests", "simpleMobTest", (test: gt.Test) => {
      *            const attackerId = "fox";
      *            const victimId = "chicken";
      *
      *            test.spawn(attackerId, new mc.BlockLocation(5, 2, 5));
      *            test.spawn(victimId, new mc.BlockLocation(2, 2, 2));
      *
      *            test.assertEntityPresentInArea(victimId, true);
      *
      *            test.succeedWhen(() => {
      *              test.assertEntityPresentInArea(victimId, false);
      *            });
      *          })
      *            .maxTicks(400)
      *            .structureName("gametests:mediumglass");
      * ```
      */
    def succeedWhen(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @remarks
      * Depending on the condition of isPresent, tests for the
      * presence of a block of a particular type on every tick. When
      * the specified block of a type is found or not found
      * (depending on isPresent), the test is marked as a success.
      * @param blockType
      * Type of block to test for.
      * @param blockLocation
      * Location of the block to test at.
      * @param isPresent
      * If true, this function tests whether a block of the
      * specified type is present. If false, tests that a block of
      * the specified type is not present.
      * @throws This function can throw errors.
      */
    def succeedWhenBlockPresent(blockType: BlockType, blockLocation: BlockLocation): Unit = js.native
    def succeedWhenBlockPresent(blockType: BlockType, blockLocation: BlockLocation, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Tests for the presence of a component on every tick.
      * Depending on the value of hasComponent, when the specified
      * component is found, the test is marked as a success.
      * @param entityTypeIdentifier
      * Type of entity to look for. If no namespace is specified,
      * 'minecraft:' is assumed.
      * @param componentIdentifier
      * Type of component to test for the presence of. If no
      * namespace is specified, 'minecraft:' is assumed.
      * @param blockLocation
      * Block location of the entity to test.
      * @param hasComponent
      * If true, this function tests for the presence of a
      * component. If false, this function tests for the lack of a
      * component.
      * @throws This function can throw errors.
      */
    def succeedWhenEntityHasComponent(
      entityTypeIdentifier: String,
      componentIdentifier: String,
      blockLocation: BlockLocation,
      hasComponent: Boolean
    ): Unit = js.native
    
    /**
      * @remarks
      * Depending on the value of isPresent, tests for the presence
      * of an entity on every tick. When an entity of the specified
      * type is found or not found (depending on isPresent), the
      * test is marked as a success.
      * @param entityTypeIdentifier
      * Type of entity to test for (e.g., 'minecraft:skeleton'). If
      * an entity namespace is not specified, 'minecraft:' is
      * assumed.
      * @param blockLocation
      * Location of the entity to test for.
      * @param isPresent
      * If true, this function tests whether an entity of the
      * specified type is present. If false, tests that an entity of
      * the specified type is not present.
      * @throws This function can throw errors.
      */
    def succeedWhenEntityPresent(entityTypeIdentifier: String, blockLocation: BlockLocation): Unit = js.native
    def succeedWhenEntityPresent(entityTypeIdentifier: String, blockLocation: BlockLocation, isPresent: Boolean): Unit = js.native
    
    /**
      * @remarks
      * Triggers a block event from a fixed list of available block
      * events.
      * @param blockLocation
      * @param event
      * Event to trigger. Valid values include minecraft:drip,
      * minecraft:grow_stalagtite, minecraft:grow_stalagmite,
      * minecraft:grow_up, minecraft:grow_down and
      * minecraft:grow_sideways.
      * @param eventParameters
      * @throws This function can throw errors.
      */
    def triggerInternalBlockEvent(blockLocation: BlockLocation, event: String): Unit = js.native
    def triggerInternalBlockEvent(blockLocation: BlockLocation, event: String, eventParameters: js.Array[Double]): Unit = js.native
    
    /**
      * @remarks
      * This asynchronous function will wait until the code in the
      * specified callback successfully completes. until can be used
      * in conjunction with .assert functions to evaluate that a
      * condition is true.
      * @param callback
      * Function with code to evaluate.
      */
    def until(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * @remarks
      * Forces a mob to walk to a particular location. Usually used
      * in conjunction with methods like .spawnWithoutBehaviors to
      * have more predictable mob behaviors. Mobs will stop
      * navigation as soon as they intersect the target location.
      * @param mob
      * Mob entity to give orders to.
      * @param blockLocation
      * Location where the entity should be walk to.
      * @param speedModifier
      * Adjustable modifier to the mob's walking speed.
      * @throws This function can throw errors.
      */
    def walkTo(mob: Entity, blockLocation: BlockLocation): Unit = js.native
    def walkTo(mob: Entity, blockLocation: BlockLocation, speedModifier: Double): Unit = js.native
    
    /**
      * @remarks
      * Forces a mob to walk to a particular location. Usually used
      * in conjunction with methods like .spawnWithoutBehaviors to
      * have more predictable mob behaviors. Mobs will stop
      * navigation as soon as they intersect the target location.
      * @param mob
      * Mob entity to give orders to.
      * @param location
      * Location where the entity should be walk to.
      * @param speedModifier
      * Adjustable modifier to the mob's walking speed.
      * @throws This function can throw errors.
      */
    def walkToLocation(mob: Entity, location: Location): Unit = js.native
    def walkToLocation(mob: Entity, location: Location, speedModifier: Double): Unit = js.native
    
    /**
      * @remarks
      * From a BlockLocation with coordinates relative to the
      * GameTest structure block, returns a new BlockLocation with
      * coordinates relative to world. Rotation of the GameTest
      * structure is also taken into account.
      * @param relativeBlockLocation
      * Location relative to the GameTest command block.
      * @returns
      * An absolute location relative to the GameTest command block.
      * @throws This function can throw errors.
      */
    def worldBlockLocation(relativeBlockLocation: BlockLocation): BlockLocation = js.native
    
    /**
      * @remarks
      * From a location with coordinates relative to the GameTest
      * structure block, returns a new location with coordinates
      * relative to world. Rotation of the GameTest structure is
      * also taken into account.
      * @param relativeLocation
      * Location relative to the GameTest command block.
      * @returns
      * An absolute location relative to the GameTest command block.
      * @throws This function can throw errors.
      */
    def worldLocation(relativeLocation: Location): Location = js.native
  }
  
  inline def register(testClassName: String, testName: String, testFunction: js.Function1[/* arg */ Test, Unit]): RegistrationBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(testClassName.asInstanceOf[js.Any], testName.asInstanceOf[js.Any], testFunction.asInstanceOf[js.Any])).asInstanceOf[RegistrationBuilder]
  
  inline def registerAsync(
    testClassName: String,
    testName: String,
    testFunction: js.Function1[/* arg */ Test, js.Promise[Unit]]
  ): RegistrationBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAsync")(testClassName.asInstanceOf[js.Any], testName.asInstanceOf[js.Any], testFunction.asInstanceOf[js.Any])).asInstanceOf[RegistrationBuilder]
}
