package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.paused
  - typings.microsoftGraph.microsoftGraphStrings.mediaJam
  - typings.microsoftGraph.microsoftGraphStrings.mediaNeeded
  - typings.microsoftGraph.microsoftGraphStrings.mediaLow
  - typings.microsoftGraph.microsoftGraphStrings.mediaEmpty
  - typings.microsoftGraph.microsoftGraphStrings.coverOpen
  - typings.microsoftGraph.microsoftGraphStrings.interlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.outputTrayMissing
  - typings.microsoftGraph.microsoftGraphStrings.outputAreaFull
  - typings.microsoftGraph.microsoftGraphStrings.markerSupplyLow
  - typings.microsoftGraph.microsoftGraphStrings.markerSupplyEmpty
  - typings.microsoftGraph.microsoftGraphStrings.inputTrayMissing
  - typings.microsoftGraph.microsoftGraphStrings.outputAreaAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteFull
  - typings.microsoftGraph.microsoftGraphStrings.fuserOverTemp
  - typings.microsoftGraph.microsoftGraphStrings.fuserUnderTemp
  - typings.microsoftGraph.microsoftGraphStrings.other
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.movingToPaused
  - typings.microsoftGraph.microsoftGraphStrings.shutdown
  - typings.microsoftGraph.microsoftGraphStrings.connectingToDevice
  - typings.microsoftGraph.microsoftGraphStrings.timedOut
  - typings.microsoftGraph.microsoftGraphStrings.stopping
  - typings.microsoftGraph.microsoftGraphStrings.stoppedPartially
  - typings.microsoftGraph.microsoftGraphStrings.tonerLow
  - typings.microsoftGraph.microsoftGraphStrings.tonerEmpty
  - typings.microsoftGraph.microsoftGraphStrings.spoolAreaFull
  - typings.microsoftGraph.microsoftGraphStrings.doorOpen
  - typings.microsoftGraph.microsoftGraphStrings.opticalPhotoConductorNearEndOfLife
  - typings.microsoftGraph.microsoftGraphStrings.opticalPhotoConductorLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.developerLow
  - typings.microsoftGraph.microsoftGraphStrings.developerEmpty
  - typings.microsoftGraph.microsoftGraphStrings.interpreterResourceUnavailable
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
  - typings.microsoftGraph.microsoftGraphStrings.alertRemovalOfBinaryChangeEntry
  - typings.microsoftGraph.microsoftGraphStrings.banderAdded
  - typings.microsoftGraph.microsoftGraphStrings.banderAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.banderAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.banderAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.banderClosed
  - typings.microsoftGraph.microsoftGraphStrings.banderConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.banderCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.banderCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.banderEmpty
  - typings.microsoftGraph.microsoftGraphStrings.banderFull
  - typings.microsoftGraph.microsoftGraphStrings.banderInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.banderInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.banderJam
  - typings.microsoftGraph.microsoftGraphStrings.banderLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.banderLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.banderMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.banderMissing
  - typings.microsoftGraph.microsoftGraphStrings.banderMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.banderNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.banderOffline
  - typings.microsoftGraph.microsoftGraphStrings.banderOpened
  - typings.microsoftGraph.microsoftGraphStrings.banderOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.banderPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.banderRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.banderRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.banderRemoved
  - typings.microsoftGraph.microsoftGraphStrings.banderResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.banderResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.banderThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.banderTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.banderTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.banderTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.banderUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.banderUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.banderUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.banderWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.binderAdded
  - typings.microsoftGraph.microsoftGraphStrings.binderAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.binderAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.binderAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.binderClosed
  - typings.microsoftGraph.microsoftGraphStrings.binderConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.binderCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.binderCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.binderEmpty
  - typings.microsoftGraph.microsoftGraphStrings.binderFull
  - typings.microsoftGraph.microsoftGraphStrings.binderInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.binderInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.binderJam
  - typings.microsoftGraph.microsoftGraphStrings.binderLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.binderLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.binderMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.binderMissing
  - typings.microsoftGraph.microsoftGraphStrings.binderMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.binderNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.binderOffline
  - typings.microsoftGraph.microsoftGraphStrings.binderOpened
  - typings.microsoftGraph.microsoftGraphStrings.binderOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.binderPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.binderRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.binderRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.binderRemoved
  - typings.microsoftGraph.microsoftGraphStrings.binderResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.binderResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.binderThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.binderTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.binderTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.binderTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.binderUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.binderUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.binderUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.binderWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.cameraFailure
  - typings.microsoftGraph.microsoftGraphStrings.chamberCooling
  - typings.microsoftGraph.microsoftGraphStrings.chamberFailure
  - typings.microsoftGraph.microsoftGraphStrings.chamberHeating
  - typings.microsoftGraph.microsoftGraphStrings.chamberTemperatureHigh
  - typings.microsoftGraph.microsoftGraphStrings.chamberTemperatureLow
  - typings.microsoftGraph.microsoftGraphStrings.cleanerLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.cleanerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.configurationChange
  - typings.microsoftGraph.microsoftGraphStrings.deactivated
  - typings.microsoftGraph.microsoftGraphStrings.deleted
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterAdded
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterClosed
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterEmpty
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterFull
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterJam
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterMissing
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterOffline
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterOpened
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterRemoved
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.dieCutterWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.extruderCooling
  - typings.microsoftGraph.microsoftGraphStrings.extruderFailure
  - typings.microsoftGraph.microsoftGraphStrings.extruderHeating
  - typings.microsoftGraph.microsoftGraphStrings.extruderJam
  - typings.microsoftGraph.microsoftGraphStrings.extruderTemperatureHigh
  - typings.microsoftGraph.microsoftGraphStrings.extruderTemperatureLow
  - typings.microsoftGraph.microsoftGraphStrings.fanFailure
  - typings.microsoftGraph.microsoftGraphStrings.faxModemLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.faxModemLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.faxModemMissing
  - typings.microsoftGraph.microsoftGraphStrings.faxModemTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.faxModemTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.folderAdded
  - typings.microsoftGraph.microsoftGraphStrings.folderAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.folderAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.folderAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.folderClosed
  - typings.microsoftGraph.microsoftGraphStrings.folderConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.folderCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.folderCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.folderEmpty
  - typings.microsoftGraph.microsoftGraphStrings.folderFull
  - typings.microsoftGraph.microsoftGraphStrings.folderInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.folderInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.folderJam
  - typings.microsoftGraph.microsoftGraphStrings.folderLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.folderLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.folderMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.folderMissing
  - typings.microsoftGraph.microsoftGraphStrings.folderMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.folderNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.folderOffline
  - typings.microsoftGraph.microsoftGraphStrings.folderOpened
  - typings.microsoftGraph.microsoftGraphStrings.folderOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.folderPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.folderRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.folderRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.folderRemoved
  - typings.microsoftGraph.microsoftGraphStrings.folderResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.folderResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.folderThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.folderTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.folderTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.folderTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.folderUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.folderUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.folderUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.folderWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.hibernate
  - typings.microsoftGraph.microsoftGraphStrings.holdNewJobs
  - typings.microsoftGraph.microsoftGraphStrings.identifyPrinterRequested
  - typings.microsoftGraph.microsoftGraphStrings.imprinterAdded
  - typings.microsoftGraph.microsoftGraphStrings.imprinterAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.imprinterAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.imprinterAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.imprinterClosed
  - typings.microsoftGraph.microsoftGraphStrings.imprinterConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.imprinterCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.imprinterCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.imprinterEmpty
  - typings.microsoftGraph.microsoftGraphStrings.imprinterFull
  - typings.microsoftGraph.microsoftGraphStrings.imprinterInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.imprinterInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.imprinterJam
  - typings.microsoftGraph.microsoftGraphStrings.imprinterLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.imprinterLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.imprinterMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.imprinterMissing
  - typings.microsoftGraph.microsoftGraphStrings.imprinterMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.imprinterNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.imprinterOffline
  - typings.microsoftGraph.microsoftGraphStrings.imprinterOpened
  - typings.microsoftGraph.microsoftGraphStrings.imprinterOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.imprinterPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.imprinterRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.imprinterRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.imprinterRemoved
  - typings.microsoftGraph.microsoftGraphStrings.imprinterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.imprinterResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.imprinterThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.imprinterTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.imprinterTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.imprinterTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.imprinterUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.imprinterUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.imprinterUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.imprinterWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.inputCannotFeedSizeSelected
  - typings.microsoftGraph.microsoftGraphStrings.inputManualInputRequest
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaColorChange
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaFormPartsChange
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaSizeChange
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayFailure
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayFeedError
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayJam
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaTypeChange
  - typings.microsoftGraph.microsoftGraphStrings.inputMediaWeightChange
  - typings.microsoftGraph.microsoftGraphStrings.inputPickRollerFailure
  - typings.microsoftGraph.microsoftGraphStrings.inputPickRollerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.inputPickRollerLifeWarn
  - typings.microsoftGraph.microsoftGraphStrings.inputPickRollerMissing
  - typings.microsoftGraph.microsoftGraphStrings.inputTrayElevationFailure
  - typings.microsoftGraph.microsoftGraphStrings.inputTrayPositionFailure
  - typings.microsoftGraph.microsoftGraphStrings.inserterAdded
  - typings.microsoftGraph.microsoftGraphStrings.inserterAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.inserterAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.inserterAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.inserterClosed
  - typings.microsoftGraph.microsoftGraphStrings.inserterConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.inserterCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.inserterCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.inserterEmpty
  - typings.microsoftGraph.microsoftGraphStrings.inserterFull
  - typings.microsoftGraph.microsoftGraphStrings.inserterInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.inserterInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.inserterJam
  - typings.microsoftGraph.microsoftGraphStrings.inserterLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.inserterLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.inserterMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.inserterMissing
  - typings.microsoftGraph.microsoftGraphStrings.inserterMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.inserterNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.inserterOffline
  - typings.microsoftGraph.microsoftGraphStrings.inserterOpened
  - typings.microsoftGraph.microsoftGraphStrings.inserterOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.inserterPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.inserterRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.inserterRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.inserterRemoved
  - typings.microsoftGraph.microsoftGraphStrings.inserterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.inserterResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.inserterThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.inserterTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.inserterTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.inserterTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.inserterUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.inserterUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.inserterUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.inserterWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.interlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.interpreterCartridgeAdded
  - typings.microsoftGraph.microsoftGraphStrings.interpreterCartridgeDeleted
  - typings.microsoftGraph.microsoftGraphStrings.interpreterComplexPageEncountered
  - typings.microsoftGraph.microsoftGraphStrings.interpreterMemoryDecrease
  - typings.microsoftGraph.microsoftGraphStrings.interpreterMemoryIncrease
  - typings.microsoftGraph.microsoftGraphStrings.interpreterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.interpreterResourceDeleted
  - typings.microsoftGraph.microsoftGraphStrings.lampAtEol
  - typings.microsoftGraph.microsoftGraphStrings.lampFailure
  - typings.microsoftGraph.microsoftGraphStrings.lampNearEol
  - typings.microsoftGraph.microsoftGraphStrings.laserAtEol
  - typings.microsoftGraph.microsoftGraphStrings.laserFailure
  - typings.microsoftGraph.microsoftGraphStrings.laserNearEol
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAdded
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeClosed
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeEmpty
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeFull
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeJam
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMissing
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOffline
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOpened
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopePowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRemoved
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.markerAdjustingPrintQuality
  - typings.microsoftGraph.microsoftGraphStrings.markerCleanerMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerDeveloperAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerDeveloperEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerDeveloperMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerFuserMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerFuserThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.markerFuserTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.markerInkAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerInkEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerInkMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerOpcMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerSupplyAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.markerSupplyMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerTonerCartridgeMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerTonerMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleFull
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteMissing
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleFull
  - typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleMissing
  - typings.microsoftGraph.microsoftGraphStrings.materialEmpty
  - typings.microsoftGraph.microsoftGraphStrings.materialLow
  - typings.microsoftGraph.microsoftGraphStrings.materialNeeded
  - typings.microsoftGraph.microsoftGraphStrings.mediaDrying
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathCannotDuplexMediaSelected
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathFailure
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathInputEmpty
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathInputFeedError
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathInputJam
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathInputRequest
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathJam
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayFull
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayMissing
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputFeedError
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputFull
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputJam
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerFailure
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerLifeWarn
  - typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerMissing
  - typings.microsoftGraph.microsoftGraphStrings.motorFailure
  - typings.microsoftGraph.microsoftGraphStrings.outputMailboxSelectFailure
  - typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayFailure
  - typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayFeedError
  - typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayJam
  - typings.microsoftGraph.microsoftGraphStrings.perforaterAdded
  - typings.microsoftGraph.microsoftGraphStrings.perforaterAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.perforaterAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.perforaterAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.perforaterClosed
  - typings.microsoftGraph.microsoftGraphStrings.perforaterConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.perforaterCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.perforaterCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.perforaterEmpty
  - typings.microsoftGraph.microsoftGraphStrings.perforaterFull
  - typings.microsoftGraph.microsoftGraphStrings.perforaterInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.perforaterInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.perforaterJam
  - typings.microsoftGraph.microsoftGraphStrings.perforaterLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.perforaterLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.perforaterMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.perforaterMissing
  - typings.microsoftGraph.microsoftGraphStrings.perforaterMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.perforaterNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.perforaterOffline
  - typings.microsoftGraph.microsoftGraphStrings.perforaterOpened
  - typings.microsoftGraph.microsoftGraphStrings.perforaterOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.perforaterPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.perforaterRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.perforaterRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.perforaterRemoved
  - typings.microsoftGraph.microsoftGraphStrings.perforaterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.perforaterResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.perforaterThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.perforaterTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.perforaterTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.perforaterTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.perforaterUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.perforaterUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.perforaterUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.perforaterWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.platformCooling
  - typings.microsoftGraph.microsoftGraphStrings.platformFailure
  - typings.microsoftGraph.microsoftGraphStrings.platformHeating
  - typings.microsoftGraph.microsoftGraphStrings.platformTemperatureHigh
  - typings.microsoftGraph.microsoftGraphStrings.platformTemperatureLow
  - typings.microsoftGraph.microsoftGraphStrings.powerDown
  - typings.microsoftGraph.microsoftGraphStrings.powerUp
  - typings.microsoftGraph.microsoftGraphStrings.printerManualReset
  - typings.microsoftGraph.microsoftGraphStrings.printerNmsReset
  - typings.microsoftGraph.microsoftGraphStrings.printerReadyToPrint
  - typings.microsoftGraph.microsoftGraphStrings.puncherAdded
  - typings.microsoftGraph.microsoftGraphStrings.puncherAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.puncherAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.puncherAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.puncherClosed
  - typings.microsoftGraph.microsoftGraphStrings.puncherConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.puncherCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.puncherCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.puncherEmpty
  - typings.microsoftGraph.microsoftGraphStrings.puncherFull
  - typings.microsoftGraph.microsoftGraphStrings.puncherInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.puncherInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.puncherJam
  - typings.microsoftGraph.microsoftGraphStrings.puncherLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.puncherLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.puncherMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.puncherMissing
  - typings.microsoftGraph.microsoftGraphStrings.puncherMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.puncherNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.puncherOffline
  - typings.microsoftGraph.microsoftGraphStrings.puncherOpened
  - typings.microsoftGraph.microsoftGraphStrings.puncherOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.puncherPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.puncherRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.puncherRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.puncherRemoved
  - typings.microsoftGraph.microsoftGraphStrings.puncherResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.puncherResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.puncherThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.puncherTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.puncherTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.puncherTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.puncherUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.puncherUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.puncherUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.puncherWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.resuming
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathFailure
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputEmpty
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputFeedError
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputJam
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputRequest
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathJam
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputFeedError
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputFull
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputJam
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerFailure
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerLifeWarn
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerMissing
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayFull
  - typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayMissing
  - typings.microsoftGraph.microsoftGraphStrings.scannerLightFailure
  - typings.microsoftGraph.microsoftGraphStrings.scannerLightLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.scannerLightLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.scannerLightMissing
  - typings.microsoftGraph.microsoftGraphStrings.scannerSensorFailure
  - typings.microsoftGraph.microsoftGraphStrings.scannerSensorLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.scannerSensorLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.scannerSensorMissing
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterAdded
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterClosed
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterEmpty
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterFull
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterJam
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterMissing
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterOffline
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterOpened
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterRemoved
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.separationCutterWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAdded
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorClosed
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorEmpty
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorFull
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorJam
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMissing
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOffline
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOpened
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRemoved
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.sheetRotatorWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.slitterAdded
  - typings.microsoftGraph.microsoftGraphStrings.slitterAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.slitterAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.slitterAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.slitterClosed
  - typings.microsoftGraph.microsoftGraphStrings.slitterConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.slitterCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.slitterCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.slitterEmpty
  - typings.microsoftGraph.microsoftGraphStrings.slitterFull
  - typings.microsoftGraph.microsoftGraphStrings.slitterInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.slitterInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.slitterJam
  - typings.microsoftGraph.microsoftGraphStrings.slitterLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.slitterLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.slitterMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.slitterMissing
  - typings.microsoftGraph.microsoftGraphStrings.slitterMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.slitterNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.slitterOffline
  - typings.microsoftGraph.microsoftGraphStrings.slitterOpened
  - typings.microsoftGraph.microsoftGraphStrings.slitterOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.slitterPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.slitterRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.slitterRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.slitterRemoved
  - typings.microsoftGraph.microsoftGraphStrings.slitterResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.slitterResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.slitterThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.slitterTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.slitterTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.slitterTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.slitterUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.slitterUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.slitterUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.slitterWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.stackerAdded
  - typings.microsoftGraph.microsoftGraphStrings.stackerAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.stackerAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.stackerAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.stackerClosed
  - typings.microsoftGraph.microsoftGraphStrings.stackerConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.stackerCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.stackerCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.stackerEmpty
  - typings.microsoftGraph.microsoftGraphStrings.stackerFull
  - typings.microsoftGraph.microsoftGraphStrings.stackerInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.stackerInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.stackerJam
  - typings.microsoftGraph.microsoftGraphStrings.stackerLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.stackerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.stackerMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.stackerMissing
  - typings.microsoftGraph.microsoftGraphStrings.stackerMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.stackerNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.stackerOffline
  - typings.microsoftGraph.microsoftGraphStrings.stackerOpened
  - typings.microsoftGraph.microsoftGraphStrings.stackerOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.stackerPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.stackerRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.stackerRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.stackerRemoved
  - typings.microsoftGraph.microsoftGraphStrings.stackerResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.stackerResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.stackerThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.stackerTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.stackerTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.stackerTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.stackerUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.stackerUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.stackerUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.stackerWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.standby
  - typings.microsoftGraph.microsoftGraphStrings.staplerAdded
  - typings.microsoftGraph.microsoftGraphStrings.staplerAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.staplerAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.staplerAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.staplerClosed
  - typings.microsoftGraph.microsoftGraphStrings.staplerConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.staplerCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.staplerCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.staplerEmpty
  - typings.microsoftGraph.microsoftGraphStrings.staplerFull
  - typings.microsoftGraph.microsoftGraphStrings.staplerInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.staplerInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.staplerJam
  - typings.microsoftGraph.microsoftGraphStrings.staplerLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.staplerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.staplerMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.staplerMissing
  - typings.microsoftGraph.microsoftGraphStrings.staplerMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.staplerNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.staplerOffline
  - typings.microsoftGraph.microsoftGraphStrings.staplerOpened
  - typings.microsoftGraph.microsoftGraphStrings.staplerOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.staplerPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.staplerRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.staplerRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.staplerRemoved
  - typings.microsoftGraph.microsoftGraphStrings.staplerResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.staplerResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.staplerThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.staplerTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.staplerTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.staplerTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.staplerUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.staplerUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.staplerUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.staplerWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.stitcherAdded
  - typings.microsoftGraph.microsoftGraphStrings.stitcherAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.stitcherAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.stitcherAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.stitcherClosed
  - typings.microsoftGraph.microsoftGraphStrings.stitcherConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.stitcherCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.stitcherCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.stitcherEmpty
  - typings.microsoftGraph.microsoftGraphStrings.stitcherFull
  - typings.microsoftGraph.microsoftGraphStrings.stitcherInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.stitcherInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.stitcherJam
  - typings.microsoftGraph.microsoftGraphStrings.stitcherLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.stitcherLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.stitcherMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.stitcherMissing
  - typings.microsoftGraph.microsoftGraphStrings.stitcherMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.stitcherNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.stitcherOffline
  - typings.microsoftGraph.microsoftGraphStrings.stitcherOpened
  - typings.microsoftGraph.microsoftGraphStrings.stitcherOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.stitcherPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.stitcherRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.stitcherRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.stitcherRemoved
  - typings.microsoftGraph.microsoftGraphStrings.stitcherResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.stitcherResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.stitcherThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.stitcherTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.stitcherTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.stitcherTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.stitcherUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.stitcherUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.stitcherUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.stitcherWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.subunitAdded
  - typings.microsoftGraph.microsoftGraphStrings.subunitAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.subunitAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.subunitAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.subunitClosed
  - typings.microsoftGraph.microsoftGraphStrings.subunitCoolingDown
  - typings.microsoftGraph.microsoftGraphStrings.subunitEmpty
  - typings.microsoftGraph.microsoftGraphStrings.subunitFull
  - typings.microsoftGraph.microsoftGraphStrings.subunitLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.subunitLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.subunitMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.subunitMissing
  - typings.microsoftGraph.microsoftGraphStrings.subunitMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.subunitNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.subunitOffline
  - typings.microsoftGraph.microsoftGraphStrings.subunitOpened
  - typings.microsoftGraph.microsoftGraphStrings.subunitOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.subunitPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.subunitRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.subunitRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.subunitRemoved
  - typings.microsoftGraph.microsoftGraphStrings.subunitResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.subunitResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.subunitThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.subunitTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.subunitTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.subunitTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.subunitUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.subunitUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.subunitUnrecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.subunitWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.suspend
  - typings.microsoftGraph.microsoftGraphStrings.testing
  - typings.microsoftGraph.microsoftGraphStrings.trimmerAdded
  - typings.microsoftGraph.microsoftGraphStrings.trimmerAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.trimmerAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.trimmerAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.trimmerClosed
  - typings.microsoftGraph.microsoftGraphStrings.trimmerConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.trimmerCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.trimmerCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.trimmerEmpty
  - typings.microsoftGraph.microsoftGraphStrings.trimmerFull
  - typings.microsoftGraph.microsoftGraphStrings.trimmerInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.trimmerInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.trimmerJam
  - typings.microsoftGraph.microsoftGraphStrings.trimmerLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.trimmerLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.trimmerMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.trimmerMissing
  - typings.microsoftGraph.microsoftGraphStrings.trimmerMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.trimmerNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.trimmerOffline
  - typings.microsoftGraph.microsoftGraphStrings.trimmerOpened
  - typings.microsoftGraph.microsoftGraphStrings.trimmerOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.trimmerPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.trimmerRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.trimmerRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.trimmerRemoved
  - typings.microsoftGraph.microsoftGraphStrings.trimmerResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.trimmerResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.trimmerThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.trimmerTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.trimmerTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.trimmerTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.trimmerUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.trimmerUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.trimmerUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.trimmerWarmingUp
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.wrapperAdded
  - typings.microsoftGraph.microsoftGraphStrings.wrapperAlmostEmpty
  - typings.microsoftGraph.microsoftGraphStrings.wrapperAlmostFull
  - typings.microsoftGraph.microsoftGraphStrings.wrapperAtLimit
  - typings.microsoftGraph.microsoftGraphStrings.wrapperClosed
  - typings.microsoftGraph.microsoftGraphStrings.wrapperConfigurationChange
  - typings.microsoftGraph.microsoftGraphStrings.wrapperCoverClosed
  - typings.microsoftGraph.microsoftGraphStrings.wrapperCoverOpen
  - typings.microsoftGraph.microsoftGraphStrings.wrapperEmpty
  - typings.microsoftGraph.microsoftGraphStrings.wrapperFull
  - typings.microsoftGraph.microsoftGraphStrings.wrapperInterlockClosed
  - typings.microsoftGraph.microsoftGraphStrings.wrapperInterlockOpen
  - typings.microsoftGraph.microsoftGraphStrings.wrapperJam
  - typings.microsoftGraph.microsoftGraphStrings.wrapperLifeAlmostOver
  - typings.microsoftGraph.microsoftGraphStrings.wrapperLifeOver
  - typings.microsoftGraph.microsoftGraphStrings.wrapperMemoryExhausted
  - typings.microsoftGraph.microsoftGraphStrings.wrapperMissing
  - typings.microsoftGraph.microsoftGraphStrings.wrapperMotorFailure
  - typings.microsoftGraph.microsoftGraphStrings.wrapperNearLimit
  - typings.microsoftGraph.microsoftGraphStrings.wrapperOffline
  - typings.microsoftGraph.microsoftGraphStrings.wrapperOpened
  - typings.microsoftGraph.microsoftGraphStrings.wrapperOverTemperature
  - typings.microsoftGraph.microsoftGraphStrings.wrapperPowerSaver
  - typings.microsoftGraph.microsoftGraphStrings.wrapperRecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.wrapperRecoverableStorage
  - typings.microsoftGraph.microsoftGraphStrings.wrapperRemoved
  - typings.microsoftGraph.microsoftGraphStrings.wrapperResourceAdded
  - typings.microsoftGraph.microsoftGraphStrings.wrapperResourceRemoved
  - typings.microsoftGraph.microsoftGraphStrings.wrapperThermistorFailure
  - typings.microsoftGraph.microsoftGraphStrings.wrapperTimingFailure
  - typings.microsoftGraph.microsoftGraphStrings.wrapperTurnedOff
  - typings.microsoftGraph.microsoftGraphStrings.wrapperTurnedOn
  - typings.microsoftGraph.microsoftGraphStrings.wrapperUnderTemperature
  - typings.microsoftGraph.microsoftGraphStrings.wrapperUnrecoverableFailure
  - typings.microsoftGraph.microsoftGraphStrings.wrapperUnrecoverableStorageError
  - typings.microsoftGraph.microsoftGraphStrings.wrapperWarmingUp
*/
trait PrinterProcessingStateDetail extends StObject
object PrinterProcessingStateDetail {
  
  inline def alertRemovalOfBinaryChangeEntry: typings.microsoftGraph.microsoftGraphStrings.alertRemovalOfBinaryChangeEntry = "alertRemovalOfBinaryChangeEntry".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.alertRemovalOfBinaryChangeEntry]
  
  inline def banderAdded: typings.microsoftGraph.microsoftGraphStrings.banderAdded = "banderAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderAdded]
  
  inline def banderAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.banderAlmostEmpty = "banderAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderAlmostEmpty]
  
  inline def banderAlmostFull: typings.microsoftGraph.microsoftGraphStrings.banderAlmostFull = "banderAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderAlmostFull]
  
  inline def banderAtLimit: typings.microsoftGraph.microsoftGraphStrings.banderAtLimit = "banderAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderAtLimit]
  
  inline def banderClosed: typings.microsoftGraph.microsoftGraphStrings.banderClosed = "banderClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderClosed]
  
  inline def banderConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.banderConfigurationChange = "banderConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderConfigurationChange]
  
  inline def banderCoverClosed: typings.microsoftGraph.microsoftGraphStrings.banderCoverClosed = "banderCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderCoverClosed]
  
  inline def banderCoverOpen: typings.microsoftGraph.microsoftGraphStrings.banderCoverOpen = "banderCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderCoverOpen]
  
  inline def banderEmpty: typings.microsoftGraph.microsoftGraphStrings.banderEmpty = "banderEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderEmpty]
  
  inline def banderFull: typings.microsoftGraph.microsoftGraphStrings.banderFull = "banderFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderFull]
  
  inline def banderInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.banderInterlockClosed = "banderInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderInterlockClosed]
  
  inline def banderInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.banderInterlockOpen = "banderInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderInterlockOpen]
  
  inline def banderJam: typings.microsoftGraph.microsoftGraphStrings.banderJam = "banderJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderJam]
  
  inline def banderLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.banderLifeAlmostOver = "banderLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderLifeAlmostOver]
  
  inline def banderLifeOver: typings.microsoftGraph.microsoftGraphStrings.banderLifeOver = "banderLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderLifeOver]
  
  inline def banderMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.banderMemoryExhausted = "banderMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderMemoryExhausted]
  
  inline def banderMissing: typings.microsoftGraph.microsoftGraphStrings.banderMissing = "banderMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderMissing]
  
  inline def banderMotorFailure: typings.microsoftGraph.microsoftGraphStrings.banderMotorFailure = "banderMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderMotorFailure]
  
  inline def banderNearLimit: typings.microsoftGraph.microsoftGraphStrings.banderNearLimit = "banderNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderNearLimit]
  
  inline def banderOffline: typings.microsoftGraph.microsoftGraphStrings.banderOffline = "banderOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderOffline]
  
  inline def banderOpened: typings.microsoftGraph.microsoftGraphStrings.banderOpened = "banderOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderOpened]
  
  inline def banderOverTemperature: typings.microsoftGraph.microsoftGraphStrings.banderOverTemperature = "banderOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderOverTemperature]
  
  inline def banderPowerSaver: typings.microsoftGraph.microsoftGraphStrings.banderPowerSaver = "banderPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderPowerSaver]
  
  inline def banderRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.banderRecoverableFailure = "banderRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderRecoverableFailure]
  
  inline def banderRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.banderRecoverableStorage = "banderRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderRecoverableStorage]
  
  inline def banderRemoved: typings.microsoftGraph.microsoftGraphStrings.banderRemoved = "banderRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderRemoved]
  
  inline def banderResourceAdded: typings.microsoftGraph.microsoftGraphStrings.banderResourceAdded = "banderResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderResourceAdded]
  
  inline def banderResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.banderResourceRemoved = "banderResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderResourceRemoved]
  
  inline def banderThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.banderThermistorFailure = "banderThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderThermistorFailure]
  
  inline def banderTimingFailure: typings.microsoftGraph.microsoftGraphStrings.banderTimingFailure = "banderTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderTimingFailure]
  
  inline def banderTurnedOff: typings.microsoftGraph.microsoftGraphStrings.banderTurnedOff = "banderTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderTurnedOff]
  
  inline def banderTurnedOn: typings.microsoftGraph.microsoftGraphStrings.banderTurnedOn = "banderTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderTurnedOn]
  
  inline def banderUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.banderUnderTemperature = "banderUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderUnderTemperature]
  
  inline def banderUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.banderUnrecoverableFailure = "banderUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderUnrecoverableFailure]
  
  inline def banderUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.banderUnrecoverableStorageError = "banderUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderUnrecoverableStorageError]
  
  inline def banderWarmingUp: typings.microsoftGraph.microsoftGraphStrings.banderWarmingUp = "banderWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.banderWarmingUp]
  
  inline def binderAdded: typings.microsoftGraph.microsoftGraphStrings.binderAdded = "binderAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderAdded]
  
  inline def binderAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.binderAlmostEmpty = "binderAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderAlmostEmpty]
  
  inline def binderAlmostFull: typings.microsoftGraph.microsoftGraphStrings.binderAlmostFull = "binderAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderAlmostFull]
  
  inline def binderAtLimit: typings.microsoftGraph.microsoftGraphStrings.binderAtLimit = "binderAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderAtLimit]
  
  inline def binderClosed: typings.microsoftGraph.microsoftGraphStrings.binderClosed = "binderClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderClosed]
  
  inline def binderConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.binderConfigurationChange = "binderConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderConfigurationChange]
  
  inline def binderCoverClosed: typings.microsoftGraph.microsoftGraphStrings.binderCoverClosed = "binderCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderCoverClosed]
  
  inline def binderCoverOpen: typings.microsoftGraph.microsoftGraphStrings.binderCoverOpen = "binderCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderCoverOpen]
  
  inline def binderEmpty: typings.microsoftGraph.microsoftGraphStrings.binderEmpty = "binderEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderEmpty]
  
  inline def binderFull: typings.microsoftGraph.microsoftGraphStrings.binderFull = "binderFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderFull]
  
  inline def binderInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.binderInterlockClosed = "binderInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderInterlockClosed]
  
  inline def binderInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.binderInterlockOpen = "binderInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderInterlockOpen]
  
  inline def binderJam: typings.microsoftGraph.microsoftGraphStrings.binderJam = "binderJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderJam]
  
  inline def binderLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.binderLifeAlmostOver = "binderLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderLifeAlmostOver]
  
  inline def binderLifeOver: typings.microsoftGraph.microsoftGraphStrings.binderLifeOver = "binderLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderLifeOver]
  
  inline def binderMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.binderMemoryExhausted = "binderMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderMemoryExhausted]
  
  inline def binderMissing: typings.microsoftGraph.microsoftGraphStrings.binderMissing = "binderMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderMissing]
  
  inline def binderMotorFailure: typings.microsoftGraph.microsoftGraphStrings.binderMotorFailure = "binderMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderMotorFailure]
  
  inline def binderNearLimit: typings.microsoftGraph.microsoftGraphStrings.binderNearLimit = "binderNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderNearLimit]
  
  inline def binderOffline: typings.microsoftGraph.microsoftGraphStrings.binderOffline = "binderOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderOffline]
  
  inline def binderOpened: typings.microsoftGraph.microsoftGraphStrings.binderOpened = "binderOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderOpened]
  
  inline def binderOverTemperature: typings.microsoftGraph.microsoftGraphStrings.binderOverTemperature = "binderOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderOverTemperature]
  
  inline def binderPowerSaver: typings.microsoftGraph.microsoftGraphStrings.binderPowerSaver = "binderPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderPowerSaver]
  
  inline def binderRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.binderRecoverableFailure = "binderRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderRecoverableFailure]
  
  inline def binderRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.binderRecoverableStorage = "binderRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderRecoverableStorage]
  
  inline def binderRemoved: typings.microsoftGraph.microsoftGraphStrings.binderRemoved = "binderRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderRemoved]
  
  inline def binderResourceAdded: typings.microsoftGraph.microsoftGraphStrings.binderResourceAdded = "binderResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderResourceAdded]
  
  inline def binderResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.binderResourceRemoved = "binderResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderResourceRemoved]
  
  inline def binderThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.binderThermistorFailure = "binderThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderThermistorFailure]
  
  inline def binderTimingFailure: typings.microsoftGraph.microsoftGraphStrings.binderTimingFailure = "binderTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderTimingFailure]
  
  inline def binderTurnedOff: typings.microsoftGraph.microsoftGraphStrings.binderTurnedOff = "binderTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderTurnedOff]
  
  inline def binderTurnedOn: typings.microsoftGraph.microsoftGraphStrings.binderTurnedOn = "binderTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderTurnedOn]
  
  inline def binderUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.binderUnderTemperature = "binderUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderUnderTemperature]
  
  inline def binderUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.binderUnrecoverableFailure = "binderUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderUnrecoverableFailure]
  
  inline def binderUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.binderUnrecoverableStorageError = "binderUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderUnrecoverableStorageError]
  
  inline def binderWarmingUp: typings.microsoftGraph.microsoftGraphStrings.binderWarmingUp = "binderWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.binderWarmingUp]
  
  inline def cameraFailure: typings.microsoftGraph.microsoftGraphStrings.cameraFailure = "cameraFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.cameraFailure]
  
  inline def chamberCooling: typings.microsoftGraph.microsoftGraphStrings.chamberCooling = "chamberCooling".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.chamberCooling]
  
  inline def chamberFailure: typings.microsoftGraph.microsoftGraphStrings.chamberFailure = "chamberFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.chamberFailure]
  
  inline def chamberHeating: typings.microsoftGraph.microsoftGraphStrings.chamberHeating = "chamberHeating".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.chamberHeating]
  
  inline def chamberTemperatureHigh: typings.microsoftGraph.microsoftGraphStrings.chamberTemperatureHigh = "chamberTemperatureHigh".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.chamberTemperatureHigh]
  
  inline def chamberTemperatureLow: typings.microsoftGraph.microsoftGraphStrings.chamberTemperatureLow = "chamberTemperatureLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.chamberTemperatureLow]
  
  inline def cleanerLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.cleanerLifeAlmostOver = "cleanerLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.cleanerLifeAlmostOver]
  
  inline def cleanerLifeOver: typings.microsoftGraph.microsoftGraphStrings.cleanerLifeOver = "cleanerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.cleanerLifeOver]
  
  inline def configurationChange: typings.microsoftGraph.microsoftGraphStrings.configurationChange = "configurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.configurationChange]
  
  inline def connectingToDevice: typings.microsoftGraph.microsoftGraphStrings.connectingToDevice = "connectingToDevice".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.connectingToDevice]
  
  inline def coverOpen: typings.microsoftGraph.microsoftGraphStrings.coverOpen = "coverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.coverOpen]
  
  inline def deactivated: typings.microsoftGraph.microsoftGraphStrings.deactivated = "deactivated".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deactivated]
  
  inline def deleted: typings.microsoftGraph.microsoftGraphStrings.deleted = "deleted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deleted]
  
  inline def developerEmpty: typings.microsoftGraph.microsoftGraphStrings.developerEmpty = "developerEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.developerEmpty]
  
  inline def developerLow: typings.microsoftGraph.microsoftGraphStrings.developerLow = "developerLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.developerLow]
  
  inline def dieCutterAdded: typings.microsoftGraph.microsoftGraphStrings.dieCutterAdded = "dieCutterAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterAdded]
  
  inline def dieCutterAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.dieCutterAlmostEmpty = "dieCutterAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterAlmostEmpty]
  
  inline def dieCutterAlmostFull: typings.microsoftGraph.microsoftGraphStrings.dieCutterAlmostFull = "dieCutterAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterAlmostFull]
  
  inline def dieCutterAtLimit: typings.microsoftGraph.microsoftGraphStrings.dieCutterAtLimit = "dieCutterAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterAtLimit]
  
  inline def dieCutterClosed: typings.microsoftGraph.microsoftGraphStrings.dieCutterClosed = "dieCutterClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterClosed]
  
  inline def dieCutterConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.dieCutterConfigurationChange = "dieCutterConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterConfigurationChange]
  
  inline def dieCutterCoverClosed: typings.microsoftGraph.microsoftGraphStrings.dieCutterCoverClosed = "dieCutterCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterCoverClosed]
  
  inline def dieCutterCoverOpen: typings.microsoftGraph.microsoftGraphStrings.dieCutterCoverOpen = "dieCutterCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterCoverOpen]
  
  inline def dieCutterEmpty: typings.microsoftGraph.microsoftGraphStrings.dieCutterEmpty = "dieCutterEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterEmpty]
  
  inline def dieCutterFull: typings.microsoftGraph.microsoftGraphStrings.dieCutterFull = "dieCutterFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterFull]
  
  inline def dieCutterInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.dieCutterInterlockClosed = "dieCutterInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterInterlockClosed]
  
  inline def dieCutterInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.dieCutterInterlockOpen = "dieCutterInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterInterlockOpen]
  
  inline def dieCutterJam: typings.microsoftGraph.microsoftGraphStrings.dieCutterJam = "dieCutterJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterJam]
  
  inline def dieCutterLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.dieCutterLifeAlmostOver = "dieCutterLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterLifeAlmostOver]
  
  inline def dieCutterLifeOver: typings.microsoftGraph.microsoftGraphStrings.dieCutterLifeOver = "dieCutterLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterLifeOver]
  
  inline def dieCutterMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.dieCutterMemoryExhausted = "dieCutterMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterMemoryExhausted]
  
  inline def dieCutterMissing: typings.microsoftGraph.microsoftGraphStrings.dieCutterMissing = "dieCutterMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterMissing]
  
  inline def dieCutterMotorFailure: typings.microsoftGraph.microsoftGraphStrings.dieCutterMotorFailure = "dieCutterMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterMotorFailure]
  
  inline def dieCutterNearLimit: typings.microsoftGraph.microsoftGraphStrings.dieCutterNearLimit = "dieCutterNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterNearLimit]
  
  inline def dieCutterOffline: typings.microsoftGraph.microsoftGraphStrings.dieCutterOffline = "dieCutterOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterOffline]
  
  inline def dieCutterOpened: typings.microsoftGraph.microsoftGraphStrings.dieCutterOpened = "dieCutterOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterOpened]
  
  inline def dieCutterOverTemperature: typings.microsoftGraph.microsoftGraphStrings.dieCutterOverTemperature = "dieCutterOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterOverTemperature]
  
  inline def dieCutterPowerSaver: typings.microsoftGraph.microsoftGraphStrings.dieCutterPowerSaver = "dieCutterPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterPowerSaver]
  
  inline def dieCutterRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.dieCutterRecoverableFailure = "dieCutterRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterRecoverableFailure]
  
  inline def dieCutterRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.dieCutterRecoverableStorage = "dieCutterRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterRecoverableStorage]
  
  inline def dieCutterRemoved: typings.microsoftGraph.microsoftGraphStrings.dieCutterRemoved = "dieCutterRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterRemoved]
  
  inline def dieCutterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.dieCutterResourceAdded = "dieCutterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterResourceAdded]
  
  inline def dieCutterResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.dieCutterResourceRemoved = "dieCutterResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterResourceRemoved]
  
  inline def dieCutterThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.dieCutterThermistorFailure = "dieCutterThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterThermistorFailure]
  
  inline def dieCutterTimingFailure: typings.microsoftGraph.microsoftGraphStrings.dieCutterTimingFailure = "dieCutterTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterTimingFailure]
  
  inline def dieCutterTurnedOff: typings.microsoftGraph.microsoftGraphStrings.dieCutterTurnedOff = "dieCutterTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterTurnedOff]
  
  inline def dieCutterTurnedOn: typings.microsoftGraph.microsoftGraphStrings.dieCutterTurnedOn = "dieCutterTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterTurnedOn]
  
  inline def dieCutterUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.dieCutterUnderTemperature = "dieCutterUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterUnderTemperature]
  
  inline def dieCutterUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.dieCutterUnrecoverableFailure = "dieCutterUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterUnrecoverableFailure]
  
  inline def dieCutterUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.dieCutterUnrecoverableStorageError = "dieCutterUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterUnrecoverableStorageError]
  
  inline def dieCutterWarmingUp: typings.microsoftGraph.microsoftGraphStrings.dieCutterWarmingUp = "dieCutterWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dieCutterWarmingUp]
  
  inline def doorOpen: typings.microsoftGraph.microsoftGraphStrings.doorOpen = "doorOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.doorOpen]
  
  inline def extruderCooling: typings.microsoftGraph.microsoftGraphStrings.extruderCooling = "extruderCooling".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.extruderCooling]
  
  inline def extruderFailure: typings.microsoftGraph.microsoftGraphStrings.extruderFailure = "extruderFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.extruderFailure]
  
  inline def extruderHeating: typings.microsoftGraph.microsoftGraphStrings.extruderHeating = "extruderHeating".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.extruderHeating]
  
  inline def extruderJam: typings.microsoftGraph.microsoftGraphStrings.extruderJam = "extruderJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.extruderJam]
  
  inline def extruderTemperatureHigh: typings.microsoftGraph.microsoftGraphStrings.extruderTemperatureHigh = "extruderTemperatureHigh".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.extruderTemperatureHigh]
  
  inline def extruderTemperatureLow: typings.microsoftGraph.microsoftGraphStrings.extruderTemperatureLow = "extruderTemperatureLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.extruderTemperatureLow]
  
  inline def fanFailure: typings.microsoftGraph.microsoftGraphStrings.fanFailure = "fanFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.fanFailure]
  
  inline def faxModemLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.faxModemLifeAlmostOver = "faxModemLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.faxModemLifeAlmostOver]
  
  inline def faxModemLifeOver: typings.microsoftGraph.microsoftGraphStrings.faxModemLifeOver = "faxModemLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.faxModemLifeOver]
  
  inline def faxModemMissing: typings.microsoftGraph.microsoftGraphStrings.faxModemMissing = "faxModemMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.faxModemMissing]
  
  inline def faxModemTurnedOff: typings.microsoftGraph.microsoftGraphStrings.faxModemTurnedOff = "faxModemTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.faxModemTurnedOff]
  
  inline def faxModemTurnedOn: typings.microsoftGraph.microsoftGraphStrings.faxModemTurnedOn = "faxModemTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.faxModemTurnedOn]
  
  inline def folderAdded: typings.microsoftGraph.microsoftGraphStrings.folderAdded = "folderAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderAdded]
  
  inline def folderAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.folderAlmostEmpty = "folderAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderAlmostEmpty]
  
  inline def folderAlmostFull: typings.microsoftGraph.microsoftGraphStrings.folderAlmostFull = "folderAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderAlmostFull]
  
  inline def folderAtLimit: typings.microsoftGraph.microsoftGraphStrings.folderAtLimit = "folderAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderAtLimit]
  
  inline def folderClosed: typings.microsoftGraph.microsoftGraphStrings.folderClosed = "folderClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderClosed]
  
  inline def folderConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.folderConfigurationChange = "folderConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderConfigurationChange]
  
  inline def folderCoverClosed: typings.microsoftGraph.microsoftGraphStrings.folderCoverClosed = "folderCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderCoverClosed]
  
  inline def folderCoverOpen: typings.microsoftGraph.microsoftGraphStrings.folderCoverOpen = "folderCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderCoverOpen]
  
  inline def folderEmpty: typings.microsoftGraph.microsoftGraphStrings.folderEmpty = "folderEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderEmpty]
  
  inline def folderFull: typings.microsoftGraph.microsoftGraphStrings.folderFull = "folderFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderFull]
  
  inline def folderInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.folderInterlockClosed = "folderInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderInterlockClosed]
  
  inline def folderInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.folderInterlockOpen = "folderInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderInterlockOpen]
  
  inline def folderJam: typings.microsoftGraph.microsoftGraphStrings.folderJam = "folderJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderJam]
  
  inline def folderLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.folderLifeAlmostOver = "folderLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderLifeAlmostOver]
  
  inline def folderLifeOver: typings.microsoftGraph.microsoftGraphStrings.folderLifeOver = "folderLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderLifeOver]
  
  inline def folderMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.folderMemoryExhausted = "folderMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderMemoryExhausted]
  
  inline def folderMissing: typings.microsoftGraph.microsoftGraphStrings.folderMissing = "folderMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderMissing]
  
  inline def folderMotorFailure: typings.microsoftGraph.microsoftGraphStrings.folderMotorFailure = "folderMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderMotorFailure]
  
  inline def folderNearLimit: typings.microsoftGraph.microsoftGraphStrings.folderNearLimit = "folderNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderNearLimit]
  
  inline def folderOffline: typings.microsoftGraph.microsoftGraphStrings.folderOffline = "folderOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderOffline]
  
  inline def folderOpened: typings.microsoftGraph.microsoftGraphStrings.folderOpened = "folderOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderOpened]
  
  inline def folderOverTemperature: typings.microsoftGraph.microsoftGraphStrings.folderOverTemperature = "folderOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderOverTemperature]
  
  inline def folderPowerSaver: typings.microsoftGraph.microsoftGraphStrings.folderPowerSaver = "folderPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderPowerSaver]
  
  inline def folderRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.folderRecoverableFailure = "folderRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderRecoverableFailure]
  
  inline def folderRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.folderRecoverableStorage = "folderRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderRecoverableStorage]
  
  inline def folderRemoved: typings.microsoftGraph.microsoftGraphStrings.folderRemoved = "folderRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderRemoved]
  
  inline def folderResourceAdded: typings.microsoftGraph.microsoftGraphStrings.folderResourceAdded = "folderResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderResourceAdded]
  
  inline def folderResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.folderResourceRemoved = "folderResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderResourceRemoved]
  
  inline def folderThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.folderThermistorFailure = "folderThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderThermistorFailure]
  
  inline def folderTimingFailure: typings.microsoftGraph.microsoftGraphStrings.folderTimingFailure = "folderTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderTimingFailure]
  
  inline def folderTurnedOff: typings.microsoftGraph.microsoftGraphStrings.folderTurnedOff = "folderTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderTurnedOff]
  
  inline def folderTurnedOn: typings.microsoftGraph.microsoftGraphStrings.folderTurnedOn = "folderTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderTurnedOn]
  
  inline def folderUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.folderUnderTemperature = "folderUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderUnderTemperature]
  
  inline def folderUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.folderUnrecoverableFailure = "folderUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderUnrecoverableFailure]
  
  inline def folderUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.folderUnrecoverableStorageError = "folderUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderUnrecoverableStorageError]
  
  inline def folderWarmingUp: typings.microsoftGraph.microsoftGraphStrings.folderWarmingUp = "folderWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.folderWarmingUp]
  
  inline def fuserOverTemp: typings.microsoftGraph.microsoftGraphStrings.fuserOverTemp = "fuserOverTemp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.fuserOverTemp]
  
  inline def fuserUnderTemp: typings.microsoftGraph.microsoftGraphStrings.fuserUnderTemp = "fuserUnderTemp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.fuserUnderTemp]
  
  inline def hibernate: typings.microsoftGraph.microsoftGraphStrings.hibernate = "hibernate".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.hibernate]
  
  inline def holdNewJobs: typings.microsoftGraph.microsoftGraphStrings.holdNewJobs = "holdNewJobs".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.holdNewJobs]
  
  inline def identifyPrinterRequested: typings.microsoftGraph.microsoftGraphStrings.identifyPrinterRequested = "identifyPrinterRequested".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.identifyPrinterRequested]
  
  inline def imprinterAdded: typings.microsoftGraph.microsoftGraphStrings.imprinterAdded = "imprinterAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterAdded]
  
  inline def imprinterAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.imprinterAlmostEmpty = "imprinterAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterAlmostEmpty]
  
  inline def imprinterAlmostFull: typings.microsoftGraph.microsoftGraphStrings.imprinterAlmostFull = "imprinterAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterAlmostFull]
  
  inline def imprinterAtLimit: typings.microsoftGraph.microsoftGraphStrings.imprinterAtLimit = "imprinterAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterAtLimit]
  
  inline def imprinterClosed: typings.microsoftGraph.microsoftGraphStrings.imprinterClosed = "imprinterClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterClosed]
  
  inline def imprinterConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.imprinterConfigurationChange = "imprinterConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterConfigurationChange]
  
  inline def imprinterCoverClosed: typings.microsoftGraph.microsoftGraphStrings.imprinterCoverClosed = "imprinterCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterCoverClosed]
  
  inline def imprinterCoverOpen: typings.microsoftGraph.microsoftGraphStrings.imprinterCoverOpen = "imprinterCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterCoverOpen]
  
  inline def imprinterEmpty: typings.microsoftGraph.microsoftGraphStrings.imprinterEmpty = "imprinterEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterEmpty]
  
  inline def imprinterFull: typings.microsoftGraph.microsoftGraphStrings.imprinterFull = "imprinterFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterFull]
  
  inline def imprinterInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.imprinterInterlockClosed = "imprinterInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterInterlockClosed]
  
  inline def imprinterInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.imprinterInterlockOpen = "imprinterInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterInterlockOpen]
  
  inline def imprinterJam: typings.microsoftGraph.microsoftGraphStrings.imprinterJam = "imprinterJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterJam]
  
  inline def imprinterLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.imprinterLifeAlmostOver = "imprinterLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterLifeAlmostOver]
  
  inline def imprinterLifeOver: typings.microsoftGraph.microsoftGraphStrings.imprinterLifeOver = "imprinterLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterLifeOver]
  
  inline def imprinterMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.imprinterMemoryExhausted = "imprinterMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterMemoryExhausted]
  
  inline def imprinterMissing: typings.microsoftGraph.microsoftGraphStrings.imprinterMissing = "imprinterMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterMissing]
  
  inline def imprinterMotorFailure: typings.microsoftGraph.microsoftGraphStrings.imprinterMotorFailure = "imprinterMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterMotorFailure]
  
  inline def imprinterNearLimit: typings.microsoftGraph.microsoftGraphStrings.imprinterNearLimit = "imprinterNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterNearLimit]
  
  inline def imprinterOffline: typings.microsoftGraph.microsoftGraphStrings.imprinterOffline = "imprinterOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterOffline]
  
  inline def imprinterOpened: typings.microsoftGraph.microsoftGraphStrings.imprinterOpened = "imprinterOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterOpened]
  
  inline def imprinterOverTemperature: typings.microsoftGraph.microsoftGraphStrings.imprinterOverTemperature = "imprinterOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterOverTemperature]
  
  inline def imprinterPowerSaver: typings.microsoftGraph.microsoftGraphStrings.imprinterPowerSaver = "imprinterPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterPowerSaver]
  
  inline def imprinterRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.imprinterRecoverableFailure = "imprinterRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterRecoverableFailure]
  
  inline def imprinterRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.imprinterRecoverableStorage = "imprinterRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterRecoverableStorage]
  
  inline def imprinterRemoved: typings.microsoftGraph.microsoftGraphStrings.imprinterRemoved = "imprinterRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterRemoved]
  
  inline def imprinterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.imprinterResourceAdded = "imprinterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterResourceAdded]
  
  inline def imprinterResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.imprinterResourceRemoved = "imprinterResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterResourceRemoved]
  
  inline def imprinterThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.imprinterThermistorFailure = "imprinterThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterThermistorFailure]
  
  inline def imprinterTimingFailure: typings.microsoftGraph.microsoftGraphStrings.imprinterTimingFailure = "imprinterTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterTimingFailure]
  
  inline def imprinterTurnedOff: typings.microsoftGraph.microsoftGraphStrings.imprinterTurnedOff = "imprinterTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterTurnedOff]
  
  inline def imprinterTurnedOn: typings.microsoftGraph.microsoftGraphStrings.imprinterTurnedOn = "imprinterTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterTurnedOn]
  
  inline def imprinterUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.imprinterUnderTemperature = "imprinterUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterUnderTemperature]
  
  inline def imprinterUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.imprinterUnrecoverableFailure = "imprinterUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterUnrecoverableFailure]
  
  inline def imprinterUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.imprinterUnrecoverableStorageError = "imprinterUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterUnrecoverableStorageError]
  
  inline def imprinterWarmingUp: typings.microsoftGraph.microsoftGraphStrings.imprinterWarmingUp = "imprinterWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.imprinterWarmingUp]
  
  inline def inputCannotFeedSizeSelected: typings.microsoftGraph.microsoftGraphStrings.inputCannotFeedSizeSelected = "inputCannotFeedSizeSelected".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputCannotFeedSizeSelected]
  
  inline def inputManualInputRequest: typings.microsoftGraph.microsoftGraphStrings.inputManualInputRequest = "inputManualInputRequest".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputManualInputRequest]
  
  inline def inputMediaColorChange: typings.microsoftGraph.microsoftGraphStrings.inputMediaColorChange = "inputMediaColorChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaColorChange]
  
  inline def inputMediaFormPartsChange: typings.microsoftGraph.microsoftGraphStrings.inputMediaFormPartsChange = "inputMediaFormPartsChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaFormPartsChange]
  
  inline def inputMediaSizeChange: typings.microsoftGraph.microsoftGraphStrings.inputMediaSizeChange = "inputMediaSizeChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaSizeChange]
  
  inline def inputMediaTrayFailure: typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayFailure = "inputMediaTrayFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayFailure]
  
  inline def inputMediaTrayFeedError: typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayFeedError = "inputMediaTrayFeedError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayFeedError]
  
  inline def inputMediaTrayJam: typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayJam = "inputMediaTrayJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaTrayJam]
  
  inline def inputMediaTypeChange: typings.microsoftGraph.microsoftGraphStrings.inputMediaTypeChange = "inputMediaTypeChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaTypeChange]
  
  inline def inputMediaWeightChange: typings.microsoftGraph.microsoftGraphStrings.inputMediaWeightChange = "inputMediaWeightChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputMediaWeightChange]
  
  inline def inputPickRollerFailure: typings.microsoftGraph.microsoftGraphStrings.inputPickRollerFailure = "inputPickRollerFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputPickRollerFailure]
  
  inline def inputPickRollerLifeOver: typings.microsoftGraph.microsoftGraphStrings.inputPickRollerLifeOver = "inputPickRollerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputPickRollerLifeOver]
  
  inline def inputPickRollerLifeWarn: typings.microsoftGraph.microsoftGraphStrings.inputPickRollerLifeWarn = "inputPickRollerLifeWarn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputPickRollerLifeWarn]
  
  inline def inputPickRollerMissing: typings.microsoftGraph.microsoftGraphStrings.inputPickRollerMissing = "inputPickRollerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputPickRollerMissing]
  
  inline def inputTrayElevationFailure: typings.microsoftGraph.microsoftGraphStrings.inputTrayElevationFailure = "inputTrayElevationFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputTrayElevationFailure]
  
  inline def inputTrayMissing: typings.microsoftGraph.microsoftGraphStrings.inputTrayMissing = "inputTrayMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputTrayMissing]
  
  inline def inputTrayPositionFailure: typings.microsoftGraph.microsoftGraphStrings.inputTrayPositionFailure = "inputTrayPositionFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inputTrayPositionFailure]
  
  inline def inserterAdded: typings.microsoftGraph.microsoftGraphStrings.inserterAdded = "inserterAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterAdded]
  
  inline def inserterAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.inserterAlmostEmpty = "inserterAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterAlmostEmpty]
  
  inline def inserterAlmostFull: typings.microsoftGraph.microsoftGraphStrings.inserterAlmostFull = "inserterAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterAlmostFull]
  
  inline def inserterAtLimit: typings.microsoftGraph.microsoftGraphStrings.inserterAtLimit = "inserterAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterAtLimit]
  
  inline def inserterClosed: typings.microsoftGraph.microsoftGraphStrings.inserterClosed = "inserterClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterClosed]
  
  inline def inserterConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.inserterConfigurationChange = "inserterConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterConfigurationChange]
  
  inline def inserterCoverClosed: typings.microsoftGraph.microsoftGraphStrings.inserterCoverClosed = "inserterCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterCoverClosed]
  
  inline def inserterCoverOpen: typings.microsoftGraph.microsoftGraphStrings.inserterCoverOpen = "inserterCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterCoverOpen]
  
  inline def inserterEmpty: typings.microsoftGraph.microsoftGraphStrings.inserterEmpty = "inserterEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterEmpty]
  
  inline def inserterFull: typings.microsoftGraph.microsoftGraphStrings.inserterFull = "inserterFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterFull]
  
  inline def inserterInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.inserterInterlockClosed = "inserterInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterInterlockClosed]
  
  inline def inserterInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.inserterInterlockOpen = "inserterInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterInterlockOpen]
  
  inline def inserterJam: typings.microsoftGraph.microsoftGraphStrings.inserterJam = "inserterJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterJam]
  
  inline def inserterLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.inserterLifeAlmostOver = "inserterLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterLifeAlmostOver]
  
  inline def inserterLifeOver: typings.microsoftGraph.microsoftGraphStrings.inserterLifeOver = "inserterLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterLifeOver]
  
  inline def inserterMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.inserterMemoryExhausted = "inserterMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterMemoryExhausted]
  
  inline def inserterMissing: typings.microsoftGraph.microsoftGraphStrings.inserterMissing = "inserterMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterMissing]
  
  inline def inserterMotorFailure: typings.microsoftGraph.microsoftGraphStrings.inserterMotorFailure = "inserterMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterMotorFailure]
  
  inline def inserterNearLimit: typings.microsoftGraph.microsoftGraphStrings.inserterNearLimit = "inserterNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterNearLimit]
  
  inline def inserterOffline: typings.microsoftGraph.microsoftGraphStrings.inserterOffline = "inserterOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterOffline]
  
  inline def inserterOpened: typings.microsoftGraph.microsoftGraphStrings.inserterOpened = "inserterOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterOpened]
  
  inline def inserterOverTemperature: typings.microsoftGraph.microsoftGraphStrings.inserterOverTemperature = "inserterOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterOverTemperature]
  
  inline def inserterPowerSaver: typings.microsoftGraph.microsoftGraphStrings.inserterPowerSaver = "inserterPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterPowerSaver]
  
  inline def inserterRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.inserterRecoverableFailure = "inserterRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterRecoverableFailure]
  
  inline def inserterRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.inserterRecoverableStorage = "inserterRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterRecoverableStorage]
  
  inline def inserterRemoved: typings.microsoftGraph.microsoftGraphStrings.inserterRemoved = "inserterRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterRemoved]
  
  inline def inserterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.inserterResourceAdded = "inserterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterResourceAdded]
  
  inline def inserterResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.inserterResourceRemoved = "inserterResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterResourceRemoved]
  
  inline def inserterThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.inserterThermistorFailure = "inserterThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterThermistorFailure]
  
  inline def inserterTimingFailure: typings.microsoftGraph.microsoftGraphStrings.inserterTimingFailure = "inserterTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterTimingFailure]
  
  inline def inserterTurnedOff: typings.microsoftGraph.microsoftGraphStrings.inserterTurnedOff = "inserterTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterTurnedOff]
  
  inline def inserterTurnedOn: typings.microsoftGraph.microsoftGraphStrings.inserterTurnedOn = "inserterTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterTurnedOn]
  
  inline def inserterUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.inserterUnderTemperature = "inserterUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterUnderTemperature]
  
  inline def inserterUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.inserterUnrecoverableFailure = "inserterUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterUnrecoverableFailure]
  
  inline def inserterUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.inserterUnrecoverableStorageError = "inserterUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterUnrecoverableStorageError]
  
  inline def inserterWarmingUp: typings.microsoftGraph.microsoftGraphStrings.inserterWarmingUp = "inserterWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inserterWarmingUp]
  
  inline def interlockClosed: typings.microsoftGraph.microsoftGraphStrings.interlockClosed = "interlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interlockClosed]
  
  inline def interlockOpen: typings.microsoftGraph.microsoftGraphStrings.interlockOpen = "interlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interlockOpen]
  
  inline def interpreterCartridgeAdded: typings.microsoftGraph.microsoftGraphStrings.interpreterCartridgeAdded = "interpreterCartridgeAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterCartridgeAdded]
  
  inline def interpreterCartridgeDeleted: typings.microsoftGraph.microsoftGraphStrings.interpreterCartridgeDeleted = "interpreterCartridgeDeleted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterCartridgeDeleted]
  
  inline def interpreterComplexPageEncountered: typings.microsoftGraph.microsoftGraphStrings.interpreterComplexPageEncountered = "interpreterComplexPageEncountered".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterComplexPageEncountered]
  
  inline def interpreterMemoryDecrease: typings.microsoftGraph.microsoftGraphStrings.interpreterMemoryDecrease = "interpreterMemoryDecrease".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterMemoryDecrease]
  
  inline def interpreterMemoryIncrease: typings.microsoftGraph.microsoftGraphStrings.interpreterMemoryIncrease = "interpreterMemoryIncrease".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterMemoryIncrease]
  
  inline def interpreterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.interpreterResourceAdded = "interpreterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterResourceAdded]
  
  inline def interpreterResourceDeleted: typings.microsoftGraph.microsoftGraphStrings.interpreterResourceDeleted = "interpreterResourceDeleted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterResourceDeleted]
  
  inline def interpreterResourceUnavailable: typings.microsoftGraph.microsoftGraphStrings.interpreterResourceUnavailable = "interpreterResourceUnavailable".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.interpreterResourceUnavailable]
  
  inline def lampAtEol: typings.microsoftGraph.microsoftGraphStrings.lampAtEol = "lampAtEol".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.lampAtEol]
  
  inline def lampFailure: typings.microsoftGraph.microsoftGraphStrings.lampFailure = "lampFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.lampFailure]
  
  inline def lampNearEol: typings.microsoftGraph.microsoftGraphStrings.lampNearEol = "lampNearEol".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.lampNearEol]
  
  inline def laserAtEol: typings.microsoftGraph.microsoftGraphStrings.laserAtEol = "laserAtEol".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.laserAtEol]
  
  inline def laserFailure: typings.microsoftGraph.microsoftGraphStrings.laserFailure = "laserFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.laserFailure]
  
  inline def laserNearEol: typings.microsoftGraph.microsoftGraphStrings.laserNearEol = "laserNearEol".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.laserNearEol]
  
  inline def makeEnvelopeAdded: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAdded = "makeEnvelopeAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAdded]
  
  inline def makeEnvelopeAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAlmostEmpty = "makeEnvelopeAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAlmostEmpty]
  
  inline def makeEnvelopeAlmostFull: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAlmostFull = "makeEnvelopeAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAlmostFull]
  
  inline def makeEnvelopeAtLimit: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAtLimit = "makeEnvelopeAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeAtLimit]
  
  inline def makeEnvelopeClosed: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeClosed = "makeEnvelopeClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeClosed]
  
  inline def makeEnvelopeConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeConfigurationChange = "makeEnvelopeConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeConfigurationChange]
  
  inline def makeEnvelopeCoverClosed: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeCoverClosed = "makeEnvelopeCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeCoverClosed]
  
  inline def makeEnvelopeCoverOpen: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeCoverOpen = "makeEnvelopeCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeCoverOpen]
  
  inline def makeEnvelopeEmpty: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeEmpty = "makeEnvelopeEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeEmpty]
  
  inline def makeEnvelopeFull: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeFull = "makeEnvelopeFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeFull]
  
  inline def makeEnvelopeInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeInterlockClosed = "makeEnvelopeInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeInterlockClosed]
  
  inline def makeEnvelopeInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeInterlockOpen = "makeEnvelopeInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeInterlockOpen]
  
  inline def makeEnvelopeJam: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeJam = "makeEnvelopeJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeJam]
  
  inline def makeEnvelopeLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeLifeAlmostOver = "makeEnvelopeLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeLifeAlmostOver]
  
  inline def makeEnvelopeLifeOver: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeLifeOver = "makeEnvelopeLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeLifeOver]
  
  inline def makeEnvelopeMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMemoryExhausted = "makeEnvelopeMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMemoryExhausted]
  
  inline def makeEnvelopeMissing: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMissing = "makeEnvelopeMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMissing]
  
  inline def makeEnvelopeMotorFailure: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMotorFailure = "makeEnvelopeMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeMotorFailure]
  
  inline def makeEnvelopeNearLimit: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeNearLimit = "makeEnvelopeNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeNearLimit]
  
  inline def makeEnvelopeOffline: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOffline = "makeEnvelopeOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOffline]
  
  inline def makeEnvelopeOpened: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOpened = "makeEnvelopeOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOpened]
  
  inline def makeEnvelopeOverTemperature: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOverTemperature = "makeEnvelopeOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeOverTemperature]
  
  inline def makeEnvelopePowerSaver: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopePowerSaver = "makeEnvelopePowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopePowerSaver]
  
  inline def makeEnvelopeRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRecoverableFailure = "makeEnvelopeRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRecoverableFailure]
  
  inline def makeEnvelopeRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRecoverableStorage = "makeEnvelopeRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRecoverableStorage]
  
  inline def makeEnvelopeRemoved: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRemoved = "makeEnvelopeRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeRemoved]
  
  inline def makeEnvelopeResourceAdded: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeResourceAdded = "makeEnvelopeResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeResourceAdded]
  
  inline def makeEnvelopeResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeResourceRemoved = "makeEnvelopeResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeResourceRemoved]
  
  inline def makeEnvelopeThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeThermistorFailure = "makeEnvelopeThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeThermistorFailure]
  
  inline def makeEnvelopeTimingFailure: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTimingFailure = "makeEnvelopeTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTimingFailure]
  
  inline def makeEnvelopeTurnedOff: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTurnedOff = "makeEnvelopeTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTurnedOff]
  
  inline def makeEnvelopeTurnedOn: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTurnedOn = "makeEnvelopeTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeTurnedOn]
  
  inline def makeEnvelopeUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnderTemperature = "makeEnvelopeUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnderTemperature]
  
  inline def makeEnvelopeUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnrecoverableFailure = "makeEnvelopeUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnrecoverableFailure]
  
  inline def makeEnvelopeUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnrecoverableStorageError = "makeEnvelopeUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeUnrecoverableStorageError]
  
  inline def makeEnvelopeWarmingUp: typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeWarmingUp = "makeEnvelopeWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.makeEnvelopeWarmingUp]
  
  inline def markerAdjustingPrintQuality: typings.microsoftGraph.microsoftGraphStrings.markerAdjustingPrintQuality = "markerAdjustingPrintQuality".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerAdjustingPrintQuality]
  
  inline def markerCleanerMissing: typings.microsoftGraph.microsoftGraphStrings.markerCleanerMissing = "markerCleanerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerCleanerMissing]
  
  inline def markerDeveloperAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.markerDeveloperAlmostEmpty = "markerDeveloperAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerDeveloperAlmostEmpty]
  
  inline def markerDeveloperEmpty: typings.microsoftGraph.microsoftGraphStrings.markerDeveloperEmpty = "markerDeveloperEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerDeveloperEmpty]
  
  inline def markerDeveloperMissing: typings.microsoftGraph.microsoftGraphStrings.markerDeveloperMissing = "markerDeveloperMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerDeveloperMissing]
  
  inline def markerFuserMissing: typings.microsoftGraph.microsoftGraphStrings.markerFuserMissing = "markerFuserMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerFuserMissing]
  
  inline def markerFuserThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.markerFuserThermistorFailure = "markerFuserThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerFuserThermistorFailure]
  
  inline def markerFuserTimingFailure: typings.microsoftGraph.microsoftGraphStrings.markerFuserTimingFailure = "markerFuserTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerFuserTimingFailure]
  
  inline def markerInkAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.markerInkAlmostEmpty = "markerInkAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerInkAlmostEmpty]
  
  inline def markerInkEmpty: typings.microsoftGraph.microsoftGraphStrings.markerInkEmpty = "markerInkEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerInkEmpty]
  
  inline def markerInkMissing: typings.microsoftGraph.microsoftGraphStrings.markerInkMissing = "markerInkMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerInkMissing]
  
  inline def markerOpcMissing: typings.microsoftGraph.microsoftGraphStrings.markerOpcMissing = "markerOpcMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerOpcMissing]
  
  inline def markerPrintRibbonAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonAlmostEmpty = "markerPrintRibbonAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonAlmostEmpty]
  
  inline def markerPrintRibbonEmpty: typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonEmpty = "markerPrintRibbonEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonEmpty]
  
  inline def markerPrintRibbonMissing: typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonMissing = "markerPrintRibbonMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerPrintRibbonMissing]
  
  inline def markerSupplyAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.markerSupplyAlmostEmpty = "markerSupplyAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerSupplyAlmostEmpty]
  
  inline def markerSupplyEmpty: typings.microsoftGraph.microsoftGraphStrings.markerSupplyEmpty = "markerSupplyEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerSupplyEmpty]
  
  inline def markerSupplyLow: typings.microsoftGraph.microsoftGraphStrings.markerSupplyLow = "markerSupplyLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerSupplyLow]
  
  inline def markerSupplyMissing: typings.microsoftGraph.microsoftGraphStrings.markerSupplyMissing = "markerSupplyMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerSupplyMissing]
  
  inline def markerTonerCartridgeMissing: typings.microsoftGraph.microsoftGraphStrings.markerTonerCartridgeMissing = "markerTonerCartridgeMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerTonerCartridgeMissing]
  
  inline def markerTonerMissing: typings.microsoftGraph.microsoftGraphStrings.markerTonerMissing = "markerTonerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerTonerMissing]
  
  inline def markerWasteAlmostFull: typings.microsoftGraph.microsoftGraphStrings.markerWasteAlmostFull = "markerWasteAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteAlmostFull]
  
  inline def markerWasteFull: typings.microsoftGraph.microsoftGraphStrings.markerWasteFull = "markerWasteFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteFull]
  
  inline def markerWasteInkReceptacleAlmostFull: typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleAlmostFull = "markerWasteInkReceptacleAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleAlmostFull]
  
  inline def markerWasteInkReceptacleFull: typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleFull = "markerWasteInkReceptacleFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleFull]
  
  inline def markerWasteInkReceptacleMissing: typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleMissing = "markerWasteInkReceptacleMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteInkReceptacleMissing]
  
  inline def markerWasteMissing: typings.microsoftGraph.microsoftGraphStrings.markerWasteMissing = "markerWasteMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteMissing]
  
  inline def markerWasteTonerReceptacleAlmostFull: typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleAlmostFull = "markerWasteTonerReceptacleAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleAlmostFull]
  
  inline def markerWasteTonerReceptacleFull: typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleFull = "markerWasteTonerReceptacleFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleFull]
  
  inline def markerWasteTonerReceptacleMissing: typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleMissing = "markerWasteTonerReceptacleMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.markerWasteTonerReceptacleMissing]
  
  inline def materialEmpty: typings.microsoftGraph.microsoftGraphStrings.materialEmpty = "materialEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.materialEmpty]
  
  inline def materialLow: typings.microsoftGraph.microsoftGraphStrings.materialLow = "materialLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.materialLow]
  
  inline def materialNeeded: typings.microsoftGraph.microsoftGraphStrings.materialNeeded = "materialNeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.materialNeeded]
  
  inline def mediaDrying: typings.microsoftGraph.microsoftGraphStrings.mediaDrying = "mediaDrying".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaDrying]
  
  inline def mediaEmpty: typings.microsoftGraph.microsoftGraphStrings.mediaEmpty = "mediaEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaEmpty]
  
  inline def mediaJam: typings.microsoftGraph.microsoftGraphStrings.mediaJam = "mediaJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaJam]
  
  inline def mediaLow: typings.microsoftGraph.microsoftGraphStrings.mediaLow = "mediaLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaLow]
  
  inline def mediaNeeded: typings.microsoftGraph.microsoftGraphStrings.mediaNeeded = "mediaNeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaNeeded]
  
  inline def mediaPathCannotDuplexMediaSelected: typings.microsoftGraph.microsoftGraphStrings.mediaPathCannotDuplexMediaSelected = "mediaPathCannotDuplexMediaSelected".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathCannotDuplexMediaSelected]
  
  inline def mediaPathFailure: typings.microsoftGraph.microsoftGraphStrings.mediaPathFailure = "mediaPathFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathFailure]
  
  inline def mediaPathInputEmpty: typings.microsoftGraph.microsoftGraphStrings.mediaPathInputEmpty = "mediaPathInputEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathInputEmpty]
  
  inline def mediaPathInputFeedError: typings.microsoftGraph.microsoftGraphStrings.mediaPathInputFeedError = "mediaPathInputFeedError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathInputFeedError]
  
  inline def mediaPathInputJam: typings.microsoftGraph.microsoftGraphStrings.mediaPathInputJam = "mediaPathInputJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathInputJam]
  
  inline def mediaPathInputRequest: typings.microsoftGraph.microsoftGraphStrings.mediaPathInputRequest = "mediaPathInputRequest".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathInputRequest]
  
  inline def mediaPathJam: typings.microsoftGraph.microsoftGraphStrings.mediaPathJam = "mediaPathJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathJam]
  
  inline def mediaPathMediaTrayAlmostFull: typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayAlmostFull = "mediaPathMediaTrayAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayAlmostFull]
  
  inline def mediaPathMediaTrayFull: typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayFull = "mediaPathMediaTrayFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayFull]
  
  inline def mediaPathMediaTrayMissing: typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayMissing = "mediaPathMediaTrayMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathMediaTrayMissing]
  
  inline def mediaPathOutputFeedError: typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputFeedError = "mediaPathOutputFeedError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputFeedError]
  
  inline def mediaPathOutputFull: typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputFull = "mediaPathOutputFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputFull]
  
  inline def mediaPathOutputJam: typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputJam = "mediaPathOutputJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathOutputJam]
  
  inline def mediaPathPickRollerFailure: typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerFailure = "mediaPathPickRollerFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerFailure]
  
  inline def mediaPathPickRollerLifeOver: typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerLifeOver = "mediaPathPickRollerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerLifeOver]
  
  inline def mediaPathPickRollerLifeWarn: typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerLifeWarn = "mediaPathPickRollerLifeWarn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerLifeWarn]
  
  inline def mediaPathPickRollerMissing: typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerMissing = "mediaPathPickRollerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.mediaPathPickRollerMissing]
  
  inline def motorFailure: typings.microsoftGraph.microsoftGraphStrings.motorFailure = "motorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.motorFailure]
  
  inline def movingToPaused: typings.microsoftGraph.microsoftGraphStrings.movingToPaused = "movingToPaused".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.movingToPaused]
  
  inline def none: none_ = "none".asInstanceOf[none_]
  
  inline def opticalPhotoConductorLifeOver: typings.microsoftGraph.microsoftGraphStrings.opticalPhotoConductorLifeOver = "opticalPhotoConductorLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.opticalPhotoConductorLifeOver]
  
  inline def opticalPhotoConductorNearEndOfLife: typings.microsoftGraph.microsoftGraphStrings.opticalPhotoConductorNearEndOfLife = "opticalPhotoConductorNearEndOfLife".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.opticalPhotoConductorNearEndOfLife]
  
  inline def other: typings.microsoftGraph.microsoftGraphStrings.other = "other".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.other]
  
  inline def outputAreaAlmostFull: typings.microsoftGraph.microsoftGraphStrings.outputAreaAlmostFull = "outputAreaAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputAreaAlmostFull]
  
  inline def outputAreaFull: typings.microsoftGraph.microsoftGraphStrings.outputAreaFull = "outputAreaFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputAreaFull]
  
  inline def outputMailboxSelectFailure: typings.microsoftGraph.microsoftGraphStrings.outputMailboxSelectFailure = "outputMailboxSelectFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputMailboxSelectFailure]
  
  inline def outputMediaTrayFailure: typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayFailure = "outputMediaTrayFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayFailure]
  
  inline def outputMediaTrayFeedError: typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayFeedError = "outputMediaTrayFeedError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayFeedError]
  
  inline def outputMediaTrayJam: typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayJam = "outputMediaTrayJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputMediaTrayJam]
  
  inline def outputTrayMissing: typings.microsoftGraph.microsoftGraphStrings.outputTrayMissing = "outputTrayMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.outputTrayMissing]
  
  inline def paused: typings.microsoftGraph.microsoftGraphStrings.paused = "paused".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.paused]
  
  inline def perforaterAdded: typings.microsoftGraph.microsoftGraphStrings.perforaterAdded = "perforaterAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterAdded]
  
  inline def perforaterAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.perforaterAlmostEmpty = "perforaterAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterAlmostEmpty]
  
  inline def perforaterAlmostFull: typings.microsoftGraph.microsoftGraphStrings.perforaterAlmostFull = "perforaterAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterAlmostFull]
  
  inline def perforaterAtLimit: typings.microsoftGraph.microsoftGraphStrings.perforaterAtLimit = "perforaterAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterAtLimit]
  
  inline def perforaterClosed: typings.microsoftGraph.microsoftGraphStrings.perforaterClosed = "perforaterClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterClosed]
  
  inline def perforaterConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.perforaterConfigurationChange = "perforaterConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterConfigurationChange]
  
  inline def perforaterCoverClosed: typings.microsoftGraph.microsoftGraphStrings.perforaterCoverClosed = "perforaterCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterCoverClosed]
  
  inline def perforaterCoverOpen: typings.microsoftGraph.microsoftGraphStrings.perforaterCoverOpen = "perforaterCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterCoverOpen]
  
  inline def perforaterEmpty: typings.microsoftGraph.microsoftGraphStrings.perforaterEmpty = "perforaterEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterEmpty]
  
  inline def perforaterFull: typings.microsoftGraph.microsoftGraphStrings.perforaterFull = "perforaterFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterFull]
  
  inline def perforaterInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.perforaterInterlockClosed = "perforaterInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterInterlockClosed]
  
  inline def perforaterInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.perforaterInterlockOpen = "perforaterInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterInterlockOpen]
  
  inline def perforaterJam: typings.microsoftGraph.microsoftGraphStrings.perforaterJam = "perforaterJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterJam]
  
  inline def perforaterLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.perforaterLifeAlmostOver = "perforaterLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterLifeAlmostOver]
  
  inline def perforaterLifeOver: typings.microsoftGraph.microsoftGraphStrings.perforaterLifeOver = "perforaterLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterLifeOver]
  
  inline def perforaterMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.perforaterMemoryExhausted = "perforaterMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterMemoryExhausted]
  
  inline def perforaterMissing: typings.microsoftGraph.microsoftGraphStrings.perforaterMissing = "perforaterMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterMissing]
  
  inline def perforaterMotorFailure: typings.microsoftGraph.microsoftGraphStrings.perforaterMotorFailure = "perforaterMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterMotorFailure]
  
  inline def perforaterNearLimit: typings.microsoftGraph.microsoftGraphStrings.perforaterNearLimit = "perforaterNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterNearLimit]
  
  inline def perforaterOffline: typings.microsoftGraph.microsoftGraphStrings.perforaterOffline = "perforaterOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterOffline]
  
  inline def perforaterOpened: typings.microsoftGraph.microsoftGraphStrings.perforaterOpened = "perforaterOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterOpened]
  
  inline def perforaterOverTemperature: typings.microsoftGraph.microsoftGraphStrings.perforaterOverTemperature = "perforaterOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterOverTemperature]
  
  inline def perforaterPowerSaver: typings.microsoftGraph.microsoftGraphStrings.perforaterPowerSaver = "perforaterPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterPowerSaver]
  
  inline def perforaterRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.perforaterRecoverableFailure = "perforaterRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterRecoverableFailure]
  
  inline def perforaterRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.perforaterRecoverableStorage = "perforaterRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterRecoverableStorage]
  
  inline def perforaterRemoved: typings.microsoftGraph.microsoftGraphStrings.perforaterRemoved = "perforaterRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterRemoved]
  
  inline def perforaterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.perforaterResourceAdded = "perforaterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterResourceAdded]
  
  inline def perforaterResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.perforaterResourceRemoved = "perforaterResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterResourceRemoved]
  
  inline def perforaterThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.perforaterThermistorFailure = "perforaterThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterThermistorFailure]
  
  inline def perforaterTimingFailure: typings.microsoftGraph.microsoftGraphStrings.perforaterTimingFailure = "perforaterTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterTimingFailure]
  
  inline def perforaterTurnedOff: typings.microsoftGraph.microsoftGraphStrings.perforaterTurnedOff = "perforaterTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterTurnedOff]
  
  inline def perforaterTurnedOn: typings.microsoftGraph.microsoftGraphStrings.perforaterTurnedOn = "perforaterTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterTurnedOn]
  
  inline def perforaterUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.perforaterUnderTemperature = "perforaterUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterUnderTemperature]
  
  inline def perforaterUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.perforaterUnrecoverableFailure = "perforaterUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterUnrecoverableFailure]
  
  inline def perforaterUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.perforaterUnrecoverableStorageError = "perforaterUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterUnrecoverableStorageError]
  
  inline def perforaterWarmingUp: typings.microsoftGraph.microsoftGraphStrings.perforaterWarmingUp = "perforaterWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.perforaterWarmingUp]
  
  inline def platformCooling: typings.microsoftGraph.microsoftGraphStrings.platformCooling = "platformCooling".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.platformCooling]
  
  inline def platformFailure: typings.microsoftGraph.microsoftGraphStrings.platformFailure = "platformFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.platformFailure]
  
  inline def platformHeating: typings.microsoftGraph.microsoftGraphStrings.platformHeating = "platformHeating".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.platformHeating]
  
  inline def platformTemperatureHigh: typings.microsoftGraph.microsoftGraphStrings.platformTemperatureHigh = "platformTemperatureHigh".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.platformTemperatureHigh]
  
  inline def platformTemperatureLow: typings.microsoftGraph.microsoftGraphStrings.platformTemperatureLow = "platformTemperatureLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.platformTemperatureLow]
  
  inline def powerDown: typings.microsoftGraph.microsoftGraphStrings.powerDown = "powerDown".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.powerDown]
  
  inline def powerUp: typings.microsoftGraph.microsoftGraphStrings.powerUp = "powerUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.powerUp]
  
  inline def printerManualReset: typings.microsoftGraph.microsoftGraphStrings.printerManualReset = "printerManualReset".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.printerManualReset]
  
  inline def printerNmsReset: typings.microsoftGraph.microsoftGraphStrings.printerNmsReset = "printerNmsReset".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.printerNmsReset]
  
  inline def printerReadyToPrint: typings.microsoftGraph.microsoftGraphStrings.printerReadyToPrint = "printerReadyToPrint".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.printerReadyToPrint]
  
  inline def puncherAdded: typings.microsoftGraph.microsoftGraphStrings.puncherAdded = "puncherAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherAdded]
  
  inline def puncherAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.puncherAlmostEmpty = "puncherAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherAlmostEmpty]
  
  inline def puncherAlmostFull: typings.microsoftGraph.microsoftGraphStrings.puncherAlmostFull = "puncherAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherAlmostFull]
  
  inline def puncherAtLimit: typings.microsoftGraph.microsoftGraphStrings.puncherAtLimit = "puncherAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherAtLimit]
  
  inline def puncherClosed: typings.microsoftGraph.microsoftGraphStrings.puncherClosed = "puncherClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherClosed]
  
  inline def puncherConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.puncherConfigurationChange = "puncherConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherConfigurationChange]
  
  inline def puncherCoverClosed: typings.microsoftGraph.microsoftGraphStrings.puncherCoverClosed = "puncherCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherCoverClosed]
  
  inline def puncherCoverOpen: typings.microsoftGraph.microsoftGraphStrings.puncherCoverOpen = "puncherCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherCoverOpen]
  
  inline def puncherEmpty: typings.microsoftGraph.microsoftGraphStrings.puncherEmpty = "puncherEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherEmpty]
  
  inline def puncherFull: typings.microsoftGraph.microsoftGraphStrings.puncherFull = "puncherFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherFull]
  
  inline def puncherInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.puncherInterlockClosed = "puncherInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherInterlockClosed]
  
  inline def puncherInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.puncherInterlockOpen = "puncherInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherInterlockOpen]
  
  inline def puncherJam: typings.microsoftGraph.microsoftGraphStrings.puncherJam = "puncherJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherJam]
  
  inline def puncherLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.puncherLifeAlmostOver = "puncherLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherLifeAlmostOver]
  
  inline def puncherLifeOver: typings.microsoftGraph.microsoftGraphStrings.puncherLifeOver = "puncherLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherLifeOver]
  
  inline def puncherMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.puncherMemoryExhausted = "puncherMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherMemoryExhausted]
  
  inline def puncherMissing: typings.microsoftGraph.microsoftGraphStrings.puncherMissing = "puncherMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherMissing]
  
  inline def puncherMotorFailure: typings.microsoftGraph.microsoftGraphStrings.puncherMotorFailure = "puncherMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherMotorFailure]
  
  inline def puncherNearLimit: typings.microsoftGraph.microsoftGraphStrings.puncherNearLimit = "puncherNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherNearLimit]
  
  inline def puncherOffline: typings.microsoftGraph.microsoftGraphStrings.puncherOffline = "puncherOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherOffline]
  
  inline def puncherOpened: typings.microsoftGraph.microsoftGraphStrings.puncherOpened = "puncherOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherOpened]
  
  inline def puncherOverTemperature: typings.microsoftGraph.microsoftGraphStrings.puncherOverTemperature = "puncherOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherOverTemperature]
  
  inline def puncherPowerSaver: typings.microsoftGraph.microsoftGraphStrings.puncherPowerSaver = "puncherPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherPowerSaver]
  
  inline def puncherRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.puncherRecoverableFailure = "puncherRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherRecoverableFailure]
  
  inline def puncherRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.puncherRecoverableStorage = "puncherRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherRecoverableStorage]
  
  inline def puncherRemoved: typings.microsoftGraph.microsoftGraphStrings.puncherRemoved = "puncherRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherRemoved]
  
  inline def puncherResourceAdded: typings.microsoftGraph.microsoftGraphStrings.puncherResourceAdded = "puncherResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherResourceAdded]
  
  inline def puncherResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.puncherResourceRemoved = "puncherResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherResourceRemoved]
  
  inline def puncherThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.puncherThermistorFailure = "puncherThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherThermistorFailure]
  
  inline def puncherTimingFailure: typings.microsoftGraph.microsoftGraphStrings.puncherTimingFailure = "puncherTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherTimingFailure]
  
  inline def puncherTurnedOff: typings.microsoftGraph.microsoftGraphStrings.puncherTurnedOff = "puncherTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherTurnedOff]
  
  inline def puncherTurnedOn: typings.microsoftGraph.microsoftGraphStrings.puncherTurnedOn = "puncherTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherTurnedOn]
  
  inline def puncherUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.puncherUnderTemperature = "puncherUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherUnderTemperature]
  
  inline def puncherUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.puncherUnrecoverableFailure = "puncherUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherUnrecoverableFailure]
  
  inline def puncherUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.puncherUnrecoverableStorageError = "puncherUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherUnrecoverableStorageError]
  
  inline def puncherWarmingUp: typings.microsoftGraph.microsoftGraphStrings.puncherWarmingUp = "puncherWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.puncherWarmingUp]
  
  inline def resuming: typings.microsoftGraph.microsoftGraphStrings.resuming = "resuming".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.resuming]
  
  inline def scanMediaPathFailure: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathFailure = "scanMediaPathFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathFailure]
  
  inline def scanMediaPathInputEmpty: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputEmpty = "scanMediaPathInputEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputEmpty]
  
  inline def scanMediaPathInputFeedError: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputFeedError = "scanMediaPathInputFeedError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputFeedError]
  
  inline def scanMediaPathInputJam: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputJam = "scanMediaPathInputJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputJam]
  
  inline def scanMediaPathInputRequest: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputRequest = "scanMediaPathInputRequest".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathInputRequest]
  
  inline def scanMediaPathJam: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathJam = "scanMediaPathJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathJam]
  
  inline def scanMediaPathOutputFeedError: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputFeedError = "scanMediaPathOutputFeedError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputFeedError]
  
  inline def scanMediaPathOutputFull: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputFull = "scanMediaPathOutputFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputFull]
  
  inline def scanMediaPathOutputJam: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputJam = "scanMediaPathOutputJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathOutputJam]
  
  inline def scanMediaPathPickRollerFailure: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerFailure = "scanMediaPathPickRollerFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerFailure]
  
  inline def scanMediaPathPickRollerLifeOver: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerLifeOver = "scanMediaPathPickRollerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerLifeOver]
  
  inline def scanMediaPathPickRollerLifeWarn: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerLifeWarn = "scanMediaPathPickRollerLifeWarn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerLifeWarn]
  
  inline def scanMediaPathPickRollerMissing: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerMissing = "scanMediaPathPickRollerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathPickRollerMissing]
  
  inline def scanMediaPathTrayAlmostFull: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayAlmostFull = "scanMediaPathTrayAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayAlmostFull]
  
  inline def scanMediaPathTrayFull: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayFull = "scanMediaPathTrayFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayFull]
  
  inline def scanMediaPathTrayMissing: typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayMissing = "scanMediaPathTrayMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scanMediaPathTrayMissing]
  
  inline def scannerLightFailure: typings.microsoftGraph.microsoftGraphStrings.scannerLightFailure = "scannerLightFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerLightFailure]
  
  inline def scannerLightLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.scannerLightLifeAlmostOver = "scannerLightLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerLightLifeAlmostOver]
  
  inline def scannerLightLifeOver: typings.microsoftGraph.microsoftGraphStrings.scannerLightLifeOver = "scannerLightLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerLightLifeOver]
  
  inline def scannerLightMissing: typings.microsoftGraph.microsoftGraphStrings.scannerLightMissing = "scannerLightMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerLightMissing]
  
  inline def scannerSensorFailure: typings.microsoftGraph.microsoftGraphStrings.scannerSensorFailure = "scannerSensorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerSensorFailure]
  
  inline def scannerSensorLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.scannerSensorLifeAlmostOver = "scannerSensorLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerSensorLifeAlmostOver]
  
  inline def scannerSensorLifeOver: typings.microsoftGraph.microsoftGraphStrings.scannerSensorLifeOver = "scannerSensorLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerSensorLifeOver]
  
  inline def scannerSensorMissing: typings.microsoftGraph.microsoftGraphStrings.scannerSensorMissing = "scannerSensorMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scannerSensorMissing]
  
  inline def separationCutterAdded: typings.microsoftGraph.microsoftGraphStrings.separationCutterAdded = "separationCutterAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterAdded]
  
  inline def separationCutterAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.separationCutterAlmostEmpty = "separationCutterAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterAlmostEmpty]
  
  inline def separationCutterAlmostFull: typings.microsoftGraph.microsoftGraphStrings.separationCutterAlmostFull = "separationCutterAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterAlmostFull]
  
  inline def separationCutterAtLimit: typings.microsoftGraph.microsoftGraphStrings.separationCutterAtLimit = "separationCutterAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterAtLimit]
  
  inline def separationCutterClosed: typings.microsoftGraph.microsoftGraphStrings.separationCutterClosed = "separationCutterClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterClosed]
  
  inline def separationCutterConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.separationCutterConfigurationChange = "separationCutterConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterConfigurationChange]
  
  inline def separationCutterCoverClosed: typings.microsoftGraph.microsoftGraphStrings.separationCutterCoverClosed = "separationCutterCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterCoverClosed]
  
  inline def separationCutterCoverOpen: typings.microsoftGraph.microsoftGraphStrings.separationCutterCoverOpen = "separationCutterCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterCoverOpen]
  
  inline def separationCutterEmpty: typings.microsoftGraph.microsoftGraphStrings.separationCutterEmpty = "separationCutterEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterEmpty]
  
  inline def separationCutterFull: typings.microsoftGraph.microsoftGraphStrings.separationCutterFull = "separationCutterFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterFull]
  
  inline def separationCutterInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.separationCutterInterlockClosed = "separationCutterInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterInterlockClosed]
  
  inline def separationCutterInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.separationCutterInterlockOpen = "separationCutterInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterInterlockOpen]
  
  inline def separationCutterJam: typings.microsoftGraph.microsoftGraphStrings.separationCutterJam = "separationCutterJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterJam]
  
  inline def separationCutterLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.separationCutterLifeAlmostOver = "separationCutterLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterLifeAlmostOver]
  
  inline def separationCutterLifeOver: typings.microsoftGraph.microsoftGraphStrings.separationCutterLifeOver = "separationCutterLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterLifeOver]
  
  inline def separationCutterMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.separationCutterMemoryExhausted = "separationCutterMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterMemoryExhausted]
  
  inline def separationCutterMissing: typings.microsoftGraph.microsoftGraphStrings.separationCutterMissing = "separationCutterMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterMissing]
  
  inline def separationCutterMotorFailure: typings.microsoftGraph.microsoftGraphStrings.separationCutterMotorFailure = "separationCutterMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterMotorFailure]
  
  inline def separationCutterNearLimit: typings.microsoftGraph.microsoftGraphStrings.separationCutterNearLimit = "separationCutterNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterNearLimit]
  
  inline def separationCutterOffline: typings.microsoftGraph.microsoftGraphStrings.separationCutterOffline = "separationCutterOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterOffline]
  
  inline def separationCutterOpened: typings.microsoftGraph.microsoftGraphStrings.separationCutterOpened = "separationCutterOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterOpened]
  
  inline def separationCutterOverTemperature: typings.microsoftGraph.microsoftGraphStrings.separationCutterOverTemperature = "separationCutterOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterOverTemperature]
  
  inline def separationCutterPowerSaver: typings.microsoftGraph.microsoftGraphStrings.separationCutterPowerSaver = "separationCutterPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterPowerSaver]
  
  inline def separationCutterRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.separationCutterRecoverableFailure = "separationCutterRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterRecoverableFailure]
  
  inline def separationCutterRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.separationCutterRecoverableStorage = "separationCutterRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterRecoverableStorage]
  
  inline def separationCutterRemoved: typings.microsoftGraph.microsoftGraphStrings.separationCutterRemoved = "separationCutterRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterRemoved]
  
  inline def separationCutterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.separationCutterResourceAdded = "separationCutterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterResourceAdded]
  
  inline def separationCutterResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.separationCutterResourceRemoved = "separationCutterResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterResourceRemoved]
  
  inline def separationCutterThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.separationCutterThermistorFailure = "separationCutterThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterThermistorFailure]
  
  inline def separationCutterTimingFailure: typings.microsoftGraph.microsoftGraphStrings.separationCutterTimingFailure = "separationCutterTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterTimingFailure]
  
  inline def separationCutterTurnedOff: typings.microsoftGraph.microsoftGraphStrings.separationCutterTurnedOff = "separationCutterTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterTurnedOff]
  
  inline def separationCutterTurnedOn: typings.microsoftGraph.microsoftGraphStrings.separationCutterTurnedOn = "separationCutterTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterTurnedOn]
  
  inline def separationCutterUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.separationCutterUnderTemperature = "separationCutterUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterUnderTemperature]
  
  inline def separationCutterUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.separationCutterUnrecoverableFailure = "separationCutterUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterUnrecoverableFailure]
  
  inline def separationCutterUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.separationCutterUnrecoverableStorageError = "separationCutterUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterUnrecoverableStorageError]
  
  inline def separationCutterWarmingUp: typings.microsoftGraph.microsoftGraphStrings.separationCutterWarmingUp = "separationCutterWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.separationCutterWarmingUp]
  
  inline def sheetRotatorAdded: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAdded = "sheetRotatorAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAdded]
  
  inline def sheetRotatorAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAlmostEmpty = "sheetRotatorAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAlmostEmpty]
  
  inline def sheetRotatorAlmostFull: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAlmostFull = "sheetRotatorAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAlmostFull]
  
  inline def sheetRotatorAtLimit: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAtLimit = "sheetRotatorAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorAtLimit]
  
  inline def sheetRotatorClosed: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorClosed = "sheetRotatorClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorClosed]
  
  inline def sheetRotatorConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorConfigurationChange = "sheetRotatorConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorConfigurationChange]
  
  inline def sheetRotatorCoverClosed: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorCoverClosed = "sheetRotatorCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorCoverClosed]
  
  inline def sheetRotatorCoverOpen: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorCoverOpen = "sheetRotatorCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorCoverOpen]
  
  inline def sheetRotatorEmpty: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorEmpty = "sheetRotatorEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorEmpty]
  
  inline def sheetRotatorFull: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorFull = "sheetRotatorFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorFull]
  
  inline def sheetRotatorInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorInterlockClosed = "sheetRotatorInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorInterlockClosed]
  
  inline def sheetRotatorInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorInterlockOpen = "sheetRotatorInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorInterlockOpen]
  
  inline def sheetRotatorJam: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorJam = "sheetRotatorJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorJam]
  
  inline def sheetRotatorLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorLifeAlmostOver = "sheetRotatorLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorLifeAlmostOver]
  
  inline def sheetRotatorLifeOver: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorLifeOver = "sheetRotatorLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorLifeOver]
  
  inline def sheetRotatorMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMemoryExhausted = "sheetRotatorMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMemoryExhausted]
  
  inline def sheetRotatorMissing: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMissing = "sheetRotatorMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMissing]
  
  inline def sheetRotatorMotorFailure: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMotorFailure = "sheetRotatorMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorMotorFailure]
  
  inline def sheetRotatorNearLimit: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorNearLimit = "sheetRotatorNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorNearLimit]
  
  inline def sheetRotatorOffline: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOffline = "sheetRotatorOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOffline]
  
  inline def sheetRotatorOpened: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOpened = "sheetRotatorOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOpened]
  
  inline def sheetRotatorOverTemperature: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOverTemperature = "sheetRotatorOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorOverTemperature]
  
  inline def sheetRotatorPowerSaver: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorPowerSaver = "sheetRotatorPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorPowerSaver]
  
  inline def sheetRotatorRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRecoverableFailure = "sheetRotatorRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRecoverableFailure]
  
  inline def sheetRotatorRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRecoverableStorage = "sheetRotatorRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRecoverableStorage]
  
  inline def sheetRotatorRemoved: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRemoved = "sheetRotatorRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorRemoved]
  
  inline def sheetRotatorResourceAdded: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorResourceAdded = "sheetRotatorResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorResourceAdded]
  
  inline def sheetRotatorResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorResourceRemoved = "sheetRotatorResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorResourceRemoved]
  
  inline def sheetRotatorThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorThermistorFailure = "sheetRotatorThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorThermistorFailure]
  
  inline def sheetRotatorTimingFailure: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTimingFailure = "sheetRotatorTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTimingFailure]
  
  inline def sheetRotatorTurnedOff: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTurnedOff = "sheetRotatorTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTurnedOff]
  
  inline def sheetRotatorTurnedOn: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTurnedOn = "sheetRotatorTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorTurnedOn]
  
  inline def sheetRotatorUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnderTemperature = "sheetRotatorUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnderTemperature]
  
  inline def sheetRotatorUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnrecoverableFailure = "sheetRotatorUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnrecoverableFailure]
  
  inline def sheetRotatorUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnrecoverableStorageError = "sheetRotatorUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorUnrecoverableStorageError]
  
  inline def sheetRotatorWarmingUp: typings.microsoftGraph.microsoftGraphStrings.sheetRotatorWarmingUp = "sheetRotatorWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.sheetRotatorWarmingUp]
  
  inline def shutdown: typings.microsoftGraph.microsoftGraphStrings.shutdown = "shutdown".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.shutdown]
  
  inline def slitterAdded: typings.microsoftGraph.microsoftGraphStrings.slitterAdded = "slitterAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterAdded]
  
  inline def slitterAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.slitterAlmostEmpty = "slitterAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterAlmostEmpty]
  
  inline def slitterAlmostFull: typings.microsoftGraph.microsoftGraphStrings.slitterAlmostFull = "slitterAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterAlmostFull]
  
  inline def slitterAtLimit: typings.microsoftGraph.microsoftGraphStrings.slitterAtLimit = "slitterAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterAtLimit]
  
  inline def slitterClosed: typings.microsoftGraph.microsoftGraphStrings.slitterClosed = "slitterClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterClosed]
  
  inline def slitterConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.slitterConfigurationChange = "slitterConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterConfigurationChange]
  
  inline def slitterCoverClosed: typings.microsoftGraph.microsoftGraphStrings.slitterCoverClosed = "slitterCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterCoverClosed]
  
  inline def slitterCoverOpen: typings.microsoftGraph.microsoftGraphStrings.slitterCoverOpen = "slitterCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterCoverOpen]
  
  inline def slitterEmpty: typings.microsoftGraph.microsoftGraphStrings.slitterEmpty = "slitterEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterEmpty]
  
  inline def slitterFull: typings.microsoftGraph.microsoftGraphStrings.slitterFull = "slitterFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterFull]
  
  inline def slitterInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.slitterInterlockClosed = "slitterInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterInterlockClosed]
  
  inline def slitterInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.slitterInterlockOpen = "slitterInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterInterlockOpen]
  
  inline def slitterJam: typings.microsoftGraph.microsoftGraphStrings.slitterJam = "slitterJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterJam]
  
  inline def slitterLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.slitterLifeAlmostOver = "slitterLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterLifeAlmostOver]
  
  inline def slitterLifeOver: typings.microsoftGraph.microsoftGraphStrings.slitterLifeOver = "slitterLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterLifeOver]
  
  inline def slitterMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.slitterMemoryExhausted = "slitterMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterMemoryExhausted]
  
  inline def slitterMissing: typings.microsoftGraph.microsoftGraphStrings.slitterMissing = "slitterMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterMissing]
  
  inline def slitterMotorFailure: typings.microsoftGraph.microsoftGraphStrings.slitterMotorFailure = "slitterMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterMotorFailure]
  
  inline def slitterNearLimit: typings.microsoftGraph.microsoftGraphStrings.slitterNearLimit = "slitterNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterNearLimit]
  
  inline def slitterOffline: typings.microsoftGraph.microsoftGraphStrings.slitterOffline = "slitterOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterOffline]
  
  inline def slitterOpened: typings.microsoftGraph.microsoftGraphStrings.slitterOpened = "slitterOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterOpened]
  
  inline def slitterOverTemperature: typings.microsoftGraph.microsoftGraphStrings.slitterOverTemperature = "slitterOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterOverTemperature]
  
  inline def slitterPowerSaver: typings.microsoftGraph.microsoftGraphStrings.slitterPowerSaver = "slitterPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterPowerSaver]
  
  inline def slitterRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.slitterRecoverableFailure = "slitterRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterRecoverableFailure]
  
  inline def slitterRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.slitterRecoverableStorage = "slitterRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterRecoverableStorage]
  
  inline def slitterRemoved: typings.microsoftGraph.microsoftGraphStrings.slitterRemoved = "slitterRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterRemoved]
  
  inline def slitterResourceAdded: typings.microsoftGraph.microsoftGraphStrings.slitterResourceAdded = "slitterResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterResourceAdded]
  
  inline def slitterResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.slitterResourceRemoved = "slitterResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterResourceRemoved]
  
  inline def slitterThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.slitterThermistorFailure = "slitterThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterThermistorFailure]
  
  inline def slitterTimingFailure: typings.microsoftGraph.microsoftGraphStrings.slitterTimingFailure = "slitterTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterTimingFailure]
  
  inline def slitterTurnedOff: typings.microsoftGraph.microsoftGraphStrings.slitterTurnedOff = "slitterTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterTurnedOff]
  
  inline def slitterTurnedOn: typings.microsoftGraph.microsoftGraphStrings.slitterTurnedOn = "slitterTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterTurnedOn]
  
  inline def slitterUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.slitterUnderTemperature = "slitterUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterUnderTemperature]
  
  inline def slitterUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.slitterUnrecoverableFailure = "slitterUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterUnrecoverableFailure]
  
  inline def slitterUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.slitterUnrecoverableStorageError = "slitterUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterUnrecoverableStorageError]
  
  inline def slitterWarmingUp: typings.microsoftGraph.microsoftGraphStrings.slitterWarmingUp = "slitterWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.slitterWarmingUp]
  
  inline def spoolAreaFull: typings.microsoftGraph.microsoftGraphStrings.spoolAreaFull = "spoolAreaFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.spoolAreaFull]
  
  inline def stackerAdded: typings.microsoftGraph.microsoftGraphStrings.stackerAdded = "stackerAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerAdded]
  
  inline def stackerAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.stackerAlmostEmpty = "stackerAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerAlmostEmpty]
  
  inline def stackerAlmostFull: typings.microsoftGraph.microsoftGraphStrings.stackerAlmostFull = "stackerAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerAlmostFull]
  
  inline def stackerAtLimit: typings.microsoftGraph.microsoftGraphStrings.stackerAtLimit = "stackerAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerAtLimit]
  
  inline def stackerClosed: typings.microsoftGraph.microsoftGraphStrings.stackerClosed = "stackerClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerClosed]
  
  inline def stackerConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.stackerConfigurationChange = "stackerConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerConfigurationChange]
  
  inline def stackerCoverClosed: typings.microsoftGraph.microsoftGraphStrings.stackerCoverClosed = "stackerCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerCoverClosed]
  
  inline def stackerCoverOpen: typings.microsoftGraph.microsoftGraphStrings.stackerCoverOpen = "stackerCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerCoverOpen]
  
  inline def stackerEmpty: typings.microsoftGraph.microsoftGraphStrings.stackerEmpty = "stackerEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerEmpty]
  
  inline def stackerFull: typings.microsoftGraph.microsoftGraphStrings.stackerFull = "stackerFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerFull]
  
  inline def stackerInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.stackerInterlockClosed = "stackerInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerInterlockClosed]
  
  inline def stackerInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.stackerInterlockOpen = "stackerInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerInterlockOpen]
  
  inline def stackerJam: typings.microsoftGraph.microsoftGraphStrings.stackerJam = "stackerJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerJam]
  
  inline def stackerLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.stackerLifeAlmostOver = "stackerLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerLifeAlmostOver]
  
  inline def stackerLifeOver: typings.microsoftGraph.microsoftGraphStrings.stackerLifeOver = "stackerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerLifeOver]
  
  inline def stackerMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.stackerMemoryExhausted = "stackerMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerMemoryExhausted]
  
  inline def stackerMissing: typings.microsoftGraph.microsoftGraphStrings.stackerMissing = "stackerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerMissing]
  
  inline def stackerMotorFailure: typings.microsoftGraph.microsoftGraphStrings.stackerMotorFailure = "stackerMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerMotorFailure]
  
  inline def stackerNearLimit: typings.microsoftGraph.microsoftGraphStrings.stackerNearLimit = "stackerNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerNearLimit]
  
  inline def stackerOffline: typings.microsoftGraph.microsoftGraphStrings.stackerOffline = "stackerOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerOffline]
  
  inline def stackerOpened: typings.microsoftGraph.microsoftGraphStrings.stackerOpened = "stackerOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerOpened]
  
  inline def stackerOverTemperature: typings.microsoftGraph.microsoftGraphStrings.stackerOverTemperature = "stackerOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerOverTemperature]
  
  inline def stackerPowerSaver: typings.microsoftGraph.microsoftGraphStrings.stackerPowerSaver = "stackerPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerPowerSaver]
  
  inline def stackerRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.stackerRecoverableFailure = "stackerRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerRecoverableFailure]
  
  inline def stackerRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.stackerRecoverableStorage = "stackerRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerRecoverableStorage]
  
  inline def stackerRemoved: typings.microsoftGraph.microsoftGraphStrings.stackerRemoved = "stackerRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerRemoved]
  
  inline def stackerResourceAdded: typings.microsoftGraph.microsoftGraphStrings.stackerResourceAdded = "stackerResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerResourceAdded]
  
  inline def stackerResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.stackerResourceRemoved = "stackerResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerResourceRemoved]
  
  inline def stackerThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.stackerThermistorFailure = "stackerThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerThermistorFailure]
  
  inline def stackerTimingFailure: typings.microsoftGraph.microsoftGraphStrings.stackerTimingFailure = "stackerTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerTimingFailure]
  
  inline def stackerTurnedOff: typings.microsoftGraph.microsoftGraphStrings.stackerTurnedOff = "stackerTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerTurnedOff]
  
  inline def stackerTurnedOn: typings.microsoftGraph.microsoftGraphStrings.stackerTurnedOn = "stackerTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerTurnedOn]
  
  inline def stackerUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.stackerUnderTemperature = "stackerUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerUnderTemperature]
  
  inline def stackerUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.stackerUnrecoverableFailure = "stackerUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerUnrecoverableFailure]
  
  inline def stackerUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.stackerUnrecoverableStorageError = "stackerUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerUnrecoverableStorageError]
  
  inline def stackerWarmingUp: typings.microsoftGraph.microsoftGraphStrings.stackerWarmingUp = "stackerWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stackerWarmingUp]
  
  inline def standby: typings.microsoftGraph.microsoftGraphStrings.standby = "standby".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.standby]
  
  inline def staplerAdded: typings.microsoftGraph.microsoftGraphStrings.staplerAdded = "staplerAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerAdded]
  
  inline def staplerAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.staplerAlmostEmpty = "staplerAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerAlmostEmpty]
  
  inline def staplerAlmostFull: typings.microsoftGraph.microsoftGraphStrings.staplerAlmostFull = "staplerAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerAlmostFull]
  
  inline def staplerAtLimit: typings.microsoftGraph.microsoftGraphStrings.staplerAtLimit = "staplerAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerAtLimit]
  
  inline def staplerClosed: typings.microsoftGraph.microsoftGraphStrings.staplerClosed = "staplerClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerClosed]
  
  inline def staplerConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.staplerConfigurationChange = "staplerConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerConfigurationChange]
  
  inline def staplerCoverClosed: typings.microsoftGraph.microsoftGraphStrings.staplerCoverClosed = "staplerCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerCoverClosed]
  
  inline def staplerCoverOpen: typings.microsoftGraph.microsoftGraphStrings.staplerCoverOpen = "staplerCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerCoverOpen]
  
  inline def staplerEmpty: typings.microsoftGraph.microsoftGraphStrings.staplerEmpty = "staplerEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerEmpty]
  
  inline def staplerFull: typings.microsoftGraph.microsoftGraphStrings.staplerFull = "staplerFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerFull]
  
  inline def staplerInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.staplerInterlockClosed = "staplerInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerInterlockClosed]
  
  inline def staplerInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.staplerInterlockOpen = "staplerInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerInterlockOpen]
  
  inline def staplerJam: typings.microsoftGraph.microsoftGraphStrings.staplerJam = "staplerJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerJam]
  
  inline def staplerLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.staplerLifeAlmostOver = "staplerLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerLifeAlmostOver]
  
  inline def staplerLifeOver: typings.microsoftGraph.microsoftGraphStrings.staplerLifeOver = "staplerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerLifeOver]
  
  inline def staplerMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.staplerMemoryExhausted = "staplerMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerMemoryExhausted]
  
  inline def staplerMissing: typings.microsoftGraph.microsoftGraphStrings.staplerMissing = "staplerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerMissing]
  
  inline def staplerMotorFailure: typings.microsoftGraph.microsoftGraphStrings.staplerMotorFailure = "staplerMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerMotorFailure]
  
  inline def staplerNearLimit: typings.microsoftGraph.microsoftGraphStrings.staplerNearLimit = "staplerNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerNearLimit]
  
  inline def staplerOffline: typings.microsoftGraph.microsoftGraphStrings.staplerOffline = "staplerOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerOffline]
  
  inline def staplerOpened: typings.microsoftGraph.microsoftGraphStrings.staplerOpened = "staplerOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerOpened]
  
  inline def staplerOverTemperature: typings.microsoftGraph.microsoftGraphStrings.staplerOverTemperature = "staplerOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerOverTemperature]
  
  inline def staplerPowerSaver: typings.microsoftGraph.microsoftGraphStrings.staplerPowerSaver = "staplerPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerPowerSaver]
  
  inline def staplerRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.staplerRecoverableFailure = "staplerRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerRecoverableFailure]
  
  inline def staplerRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.staplerRecoverableStorage = "staplerRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerRecoverableStorage]
  
  inline def staplerRemoved: typings.microsoftGraph.microsoftGraphStrings.staplerRemoved = "staplerRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerRemoved]
  
  inline def staplerResourceAdded: typings.microsoftGraph.microsoftGraphStrings.staplerResourceAdded = "staplerResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerResourceAdded]
  
  inline def staplerResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.staplerResourceRemoved = "staplerResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerResourceRemoved]
  
  inline def staplerThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.staplerThermistorFailure = "staplerThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerThermistorFailure]
  
  inline def staplerTimingFailure: typings.microsoftGraph.microsoftGraphStrings.staplerTimingFailure = "staplerTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerTimingFailure]
  
  inline def staplerTurnedOff: typings.microsoftGraph.microsoftGraphStrings.staplerTurnedOff = "staplerTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerTurnedOff]
  
  inline def staplerTurnedOn: typings.microsoftGraph.microsoftGraphStrings.staplerTurnedOn = "staplerTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerTurnedOn]
  
  inline def staplerUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.staplerUnderTemperature = "staplerUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerUnderTemperature]
  
  inline def staplerUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.staplerUnrecoverableFailure = "staplerUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerUnrecoverableFailure]
  
  inline def staplerUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.staplerUnrecoverableStorageError = "staplerUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerUnrecoverableStorageError]
  
  inline def staplerWarmingUp: typings.microsoftGraph.microsoftGraphStrings.staplerWarmingUp = "staplerWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.staplerWarmingUp]
  
  inline def stitcherAdded: typings.microsoftGraph.microsoftGraphStrings.stitcherAdded = "stitcherAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherAdded]
  
  inline def stitcherAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.stitcherAlmostEmpty = "stitcherAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherAlmostEmpty]
  
  inline def stitcherAlmostFull: typings.microsoftGraph.microsoftGraphStrings.stitcherAlmostFull = "stitcherAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherAlmostFull]
  
  inline def stitcherAtLimit: typings.microsoftGraph.microsoftGraphStrings.stitcherAtLimit = "stitcherAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherAtLimit]
  
  inline def stitcherClosed: typings.microsoftGraph.microsoftGraphStrings.stitcherClosed = "stitcherClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherClosed]
  
  inline def stitcherConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.stitcherConfigurationChange = "stitcherConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherConfigurationChange]
  
  inline def stitcherCoverClosed: typings.microsoftGraph.microsoftGraphStrings.stitcherCoverClosed = "stitcherCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherCoverClosed]
  
  inline def stitcherCoverOpen: typings.microsoftGraph.microsoftGraphStrings.stitcherCoverOpen = "stitcherCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherCoverOpen]
  
  inline def stitcherEmpty: typings.microsoftGraph.microsoftGraphStrings.stitcherEmpty = "stitcherEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherEmpty]
  
  inline def stitcherFull: typings.microsoftGraph.microsoftGraphStrings.stitcherFull = "stitcherFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherFull]
  
  inline def stitcherInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.stitcherInterlockClosed = "stitcherInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherInterlockClosed]
  
  inline def stitcherInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.stitcherInterlockOpen = "stitcherInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherInterlockOpen]
  
  inline def stitcherJam: typings.microsoftGraph.microsoftGraphStrings.stitcherJam = "stitcherJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherJam]
  
  inline def stitcherLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.stitcherLifeAlmostOver = "stitcherLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherLifeAlmostOver]
  
  inline def stitcherLifeOver: typings.microsoftGraph.microsoftGraphStrings.stitcherLifeOver = "stitcherLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherLifeOver]
  
  inline def stitcherMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.stitcherMemoryExhausted = "stitcherMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherMemoryExhausted]
  
  inline def stitcherMissing: typings.microsoftGraph.microsoftGraphStrings.stitcherMissing = "stitcherMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherMissing]
  
  inline def stitcherMotorFailure: typings.microsoftGraph.microsoftGraphStrings.stitcherMotorFailure = "stitcherMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherMotorFailure]
  
  inline def stitcherNearLimit: typings.microsoftGraph.microsoftGraphStrings.stitcherNearLimit = "stitcherNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherNearLimit]
  
  inline def stitcherOffline: typings.microsoftGraph.microsoftGraphStrings.stitcherOffline = "stitcherOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherOffline]
  
  inline def stitcherOpened: typings.microsoftGraph.microsoftGraphStrings.stitcherOpened = "stitcherOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherOpened]
  
  inline def stitcherOverTemperature: typings.microsoftGraph.microsoftGraphStrings.stitcherOverTemperature = "stitcherOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherOverTemperature]
  
  inline def stitcherPowerSaver: typings.microsoftGraph.microsoftGraphStrings.stitcherPowerSaver = "stitcherPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherPowerSaver]
  
  inline def stitcherRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.stitcherRecoverableFailure = "stitcherRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherRecoverableFailure]
  
  inline def stitcherRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.stitcherRecoverableStorage = "stitcherRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherRecoverableStorage]
  
  inline def stitcherRemoved: typings.microsoftGraph.microsoftGraphStrings.stitcherRemoved = "stitcherRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherRemoved]
  
  inline def stitcherResourceAdded: typings.microsoftGraph.microsoftGraphStrings.stitcherResourceAdded = "stitcherResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherResourceAdded]
  
  inline def stitcherResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.stitcherResourceRemoved = "stitcherResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherResourceRemoved]
  
  inline def stitcherThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.stitcherThermistorFailure = "stitcherThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherThermistorFailure]
  
  inline def stitcherTimingFailure: typings.microsoftGraph.microsoftGraphStrings.stitcherTimingFailure = "stitcherTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherTimingFailure]
  
  inline def stitcherTurnedOff: typings.microsoftGraph.microsoftGraphStrings.stitcherTurnedOff = "stitcherTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherTurnedOff]
  
  inline def stitcherTurnedOn: typings.microsoftGraph.microsoftGraphStrings.stitcherTurnedOn = "stitcherTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherTurnedOn]
  
  inline def stitcherUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.stitcherUnderTemperature = "stitcherUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherUnderTemperature]
  
  inline def stitcherUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.stitcherUnrecoverableFailure = "stitcherUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherUnrecoverableFailure]
  
  inline def stitcherUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.stitcherUnrecoverableStorageError = "stitcherUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherUnrecoverableStorageError]
  
  inline def stitcherWarmingUp: typings.microsoftGraph.microsoftGraphStrings.stitcherWarmingUp = "stitcherWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stitcherWarmingUp]
  
  inline def stoppedPartially: typings.microsoftGraph.microsoftGraphStrings.stoppedPartially = "stoppedPartially".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stoppedPartially]
  
  inline def stopping: typings.microsoftGraph.microsoftGraphStrings.stopping = "stopping".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.stopping]
  
  inline def subunitAdded: typings.microsoftGraph.microsoftGraphStrings.subunitAdded = "subunitAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitAdded]
  
  inline def subunitAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.subunitAlmostEmpty = "subunitAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitAlmostEmpty]
  
  inline def subunitAlmostFull: typings.microsoftGraph.microsoftGraphStrings.subunitAlmostFull = "subunitAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitAlmostFull]
  
  inline def subunitAtLimit: typings.microsoftGraph.microsoftGraphStrings.subunitAtLimit = "subunitAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitAtLimit]
  
  inline def subunitClosed: typings.microsoftGraph.microsoftGraphStrings.subunitClosed = "subunitClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitClosed]
  
  inline def subunitCoolingDown: typings.microsoftGraph.microsoftGraphStrings.subunitCoolingDown = "subunitCoolingDown".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitCoolingDown]
  
  inline def subunitEmpty: typings.microsoftGraph.microsoftGraphStrings.subunitEmpty = "subunitEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitEmpty]
  
  inline def subunitFull: typings.microsoftGraph.microsoftGraphStrings.subunitFull = "subunitFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitFull]
  
  inline def subunitLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.subunitLifeAlmostOver = "subunitLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitLifeAlmostOver]
  
  inline def subunitLifeOver: typings.microsoftGraph.microsoftGraphStrings.subunitLifeOver = "subunitLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitLifeOver]
  
  inline def subunitMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.subunitMemoryExhausted = "subunitMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitMemoryExhausted]
  
  inline def subunitMissing: typings.microsoftGraph.microsoftGraphStrings.subunitMissing = "subunitMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitMissing]
  
  inline def subunitMotorFailure: typings.microsoftGraph.microsoftGraphStrings.subunitMotorFailure = "subunitMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitMotorFailure]
  
  inline def subunitNearLimit: typings.microsoftGraph.microsoftGraphStrings.subunitNearLimit = "subunitNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitNearLimit]
  
  inline def subunitOffline: typings.microsoftGraph.microsoftGraphStrings.subunitOffline = "subunitOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitOffline]
  
  inline def subunitOpened: typings.microsoftGraph.microsoftGraphStrings.subunitOpened = "subunitOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitOpened]
  
  inline def subunitOverTemperature: typings.microsoftGraph.microsoftGraphStrings.subunitOverTemperature = "subunitOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitOverTemperature]
  
  inline def subunitPowerSaver: typings.microsoftGraph.microsoftGraphStrings.subunitPowerSaver = "subunitPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitPowerSaver]
  
  inline def subunitRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.subunitRecoverableFailure = "subunitRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitRecoverableFailure]
  
  inline def subunitRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.subunitRecoverableStorage = "subunitRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitRecoverableStorage]
  
  inline def subunitRemoved: typings.microsoftGraph.microsoftGraphStrings.subunitRemoved = "subunitRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitRemoved]
  
  inline def subunitResourceAdded: typings.microsoftGraph.microsoftGraphStrings.subunitResourceAdded = "subunitResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitResourceAdded]
  
  inline def subunitResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.subunitResourceRemoved = "subunitResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitResourceRemoved]
  
  inline def subunitThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.subunitThermistorFailure = "subunitThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitThermistorFailure]
  
  inline def subunitTimingFailure: typings.microsoftGraph.microsoftGraphStrings.subunitTimingFailure = "subunitTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitTimingFailure]
  
  inline def subunitTurnedOff: typings.microsoftGraph.microsoftGraphStrings.subunitTurnedOff = "subunitTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitTurnedOff]
  
  inline def subunitTurnedOn: typings.microsoftGraph.microsoftGraphStrings.subunitTurnedOn = "subunitTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitTurnedOn]
  
  inline def subunitUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.subunitUnderTemperature = "subunitUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitUnderTemperature]
  
  inline def subunitUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.subunitUnrecoverableFailure = "subunitUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitUnrecoverableFailure]
  
  inline def subunitUnrecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.subunitUnrecoverableStorage = "subunitUnrecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitUnrecoverableStorage]
  
  inline def subunitWarmingUp: typings.microsoftGraph.microsoftGraphStrings.subunitWarmingUp = "subunitWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.subunitWarmingUp]
  
  inline def suspend: typings.microsoftGraph.microsoftGraphStrings.suspend = "suspend".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.suspend]
  
  inline def testing: typings.microsoftGraph.microsoftGraphStrings.testing = "testing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.testing]
  
  inline def timedOut: typings.microsoftGraph.microsoftGraphStrings.timedOut = "timedOut".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.timedOut]
  
  inline def tonerEmpty: typings.microsoftGraph.microsoftGraphStrings.tonerEmpty = "tonerEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.tonerEmpty]
  
  inline def tonerLow: typings.microsoftGraph.microsoftGraphStrings.tonerLow = "tonerLow".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.tonerLow]
  
  inline def trimmerAdded: typings.microsoftGraph.microsoftGraphStrings.trimmerAdded = "trimmerAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerAdded]
  
  inline def trimmerAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.trimmerAlmostEmpty = "trimmerAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerAlmostEmpty]
  
  inline def trimmerAlmostFull: typings.microsoftGraph.microsoftGraphStrings.trimmerAlmostFull = "trimmerAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerAlmostFull]
  
  inline def trimmerAtLimit: typings.microsoftGraph.microsoftGraphStrings.trimmerAtLimit = "trimmerAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerAtLimit]
  
  inline def trimmerClosed: typings.microsoftGraph.microsoftGraphStrings.trimmerClosed = "trimmerClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerClosed]
  
  inline def trimmerConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.trimmerConfigurationChange = "trimmerConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerConfigurationChange]
  
  inline def trimmerCoverClosed: typings.microsoftGraph.microsoftGraphStrings.trimmerCoverClosed = "trimmerCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerCoverClosed]
  
  inline def trimmerCoverOpen: typings.microsoftGraph.microsoftGraphStrings.trimmerCoverOpen = "trimmerCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerCoverOpen]
  
  inline def trimmerEmpty: typings.microsoftGraph.microsoftGraphStrings.trimmerEmpty = "trimmerEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerEmpty]
  
  inline def trimmerFull: typings.microsoftGraph.microsoftGraphStrings.trimmerFull = "trimmerFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerFull]
  
  inline def trimmerInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.trimmerInterlockClosed = "trimmerInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerInterlockClosed]
  
  inline def trimmerInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.trimmerInterlockOpen = "trimmerInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerInterlockOpen]
  
  inline def trimmerJam: typings.microsoftGraph.microsoftGraphStrings.trimmerJam = "trimmerJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerJam]
  
  inline def trimmerLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.trimmerLifeAlmostOver = "trimmerLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerLifeAlmostOver]
  
  inline def trimmerLifeOver: typings.microsoftGraph.microsoftGraphStrings.trimmerLifeOver = "trimmerLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerLifeOver]
  
  inline def trimmerMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.trimmerMemoryExhausted = "trimmerMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerMemoryExhausted]
  
  inline def trimmerMissing: typings.microsoftGraph.microsoftGraphStrings.trimmerMissing = "trimmerMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerMissing]
  
  inline def trimmerMotorFailure: typings.microsoftGraph.microsoftGraphStrings.trimmerMotorFailure = "trimmerMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerMotorFailure]
  
  inline def trimmerNearLimit: typings.microsoftGraph.microsoftGraphStrings.trimmerNearLimit = "trimmerNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerNearLimit]
  
  inline def trimmerOffline: typings.microsoftGraph.microsoftGraphStrings.trimmerOffline = "trimmerOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerOffline]
  
  inline def trimmerOpened: typings.microsoftGraph.microsoftGraphStrings.trimmerOpened = "trimmerOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerOpened]
  
  inline def trimmerOverTemperature: typings.microsoftGraph.microsoftGraphStrings.trimmerOverTemperature = "trimmerOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerOverTemperature]
  
  inline def trimmerPowerSaver: typings.microsoftGraph.microsoftGraphStrings.trimmerPowerSaver = "trimmerPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerPowerSaver]
  
  inline def trimmerRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.trimmerRecoverableFailure = "trimmerRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerRecoverableFailure]
  
  inline def trimmerRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.trimmerRecoverableStorage = "trimmerRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerRecoverableStorage]
  
  inline def trimmerRemoved: typings.microsoftGraph.microsoftGraphStrings.trimmerRemoved = "trimmerRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerRemoved]
  
  inline def trimmerResourceAdded: typings.microsoftGraph.microsoftGraphStrings.trimmerResourceAdded = "trimmerResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerResourceAdded]
  
  inline def trimmerResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.trimmerResourceRemoved = "trimmerResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerResourceRemoved]
  
  inline def trimmerThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.trimmerThermistorFailure = "trimmerThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerThermistorFailure]
  
  inline def trimmerTimingFailure: typings.microsoftGraph.microsoftGraphStrings.trimmerTimingFailure = "trimmerTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerTimingFailure]
  
  inline def trimmerTurnedOff: typings.microsoftGraph.microsoftGraphStrings.trimmerTurnedOff = "trimmerTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerTurnedOff]
  
  inline def trimmerTurnedOn: typings.microsoftGraph.microsoftGraphStrings.trimmerTurnedOn = "trimmerTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerTurnedOn]
  
  inline def trimmerUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.trimmerUnderTemperature = "trimmerUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerUnderTemperature]
  
  inline def trimmerUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.trimmerUnrecoverableFailure = "trimmerUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerUnrecoverableFailure]
  
  inline def trimmerUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.trimmerUnrecoverableStorageError = "trimmerUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerUnrecoverableStorageError]
  
  inline def trimmerWarmingUp: typings.microsoftGraph.microsoftGraphStrings.trimmerWarmingUp = "trimmerWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.trimmerWarmingUp]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
  
  inline def wrapperAdded: typings.microsoftGraph.microsoftGraphStrings.wrapperAdded = "wrapperAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperAdded]
  
  inline def wrapperAlmostEmpty: typings.microsoftGraph.microsoftGraphStrings.wrapperAlmostEmpty = "wrapperAlmostEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperAlmostEmpty]
  
  inline def wrapperAlmostFull: typings.microsoftGraph.microsoftGraphStrings.wrapperAlmostFull = "wrapperAlmostFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperAlmostFull]
  
  inline def wrapperAtLimit: typings.microsoftGraph.microsoftGraphStrings.wrapperAtLimit = "wrapperAtLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperAtLimit]
  
  inline def wrapperClosed: typings.microsoftGraph.microsoftGraphStrings.wrapperClosed = "wrapperClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperClosed]
  
  inline def wrapperConfigurationChange: typings.microsoftGraph.microsoftGraphStrings.wrapperConfigurationChange = "wrapperConfigurationChange".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperConfigurationChange]
  
  inline def wrapperCoverClosed: typings.microsoftGraph.microsoftGraphStrings.wrapperCoverClosed = "wrapperCoverClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperCoverClosed]
  
  inline def wrapperCoverOpen: typings.microsoftGraph.microsoftGraphStrings.wrapperCoverOpen = "wrapperCoverOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperCoverOpen]
  
  inline def wrapperEmpty: typings.microsoftGraph.microsoftGraphStrings.wrapperEmpty = "wrapperEmpty".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperEmpty]
  
  inline def wrapperFull: typings.microsoftGraph.microsoftGraphStrings.wrapperFull = "wrapperFull".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperFull]
  
  inline def wrapperInterlockClosed: typings.microsoftGraph.microsoftGraphStrings.wrapperInterlockClosed = "wrapperInterlockClosed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperInterlockClosed]
  
  inline def wrapperInterlockOpen: typings.microsoftGraph.microsoftGraphStrings.wrapperInterlockOpen = "wrapperInterlockOpen".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperInterlockOpen]
  
  inline def wrapperJam: typings.microsoftGraph.microsoftGraphStrings.wrapperJam = "wrapperJam".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperJam]
  
  inline def wrapperLifeAlmostOver: typings.microsoftGraph.microsoftGraphStrings.wrapperLifeAlmostOver = "wrapperLifeAlmostOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperLifeAlmostOver]
  
  inline def wrapperLifeOver: typings.microsoftGraph.microsoftGraphStrings.wrapperLifeOver = "wrapperLifeOver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperLifeOver]
  
  inline def wrapperMemoryExhausted: typings.microsoftGraph.microsoftGraphStrings.wrapperMemoryExhausted = "wrapperMemoryExhausted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperMemoryExhausted]
  
  inline def wrapperMissing: typings.microsoftGraph.microsoftGraphStrings.wrapperMissing = "wrapperMissing".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperMissing]
  
  inline def wrapperMotorFailure: typings.microsoftGraph.microsoftGraphStrings.wrapperMotorFailure = "wrapperMotorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperMotorFailure]
  
  inline def wrapperNearLimit: typings.microsoftGraph.microsoftGraphStrings.wrapperNearLimit = "wrapperNearLimit".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperNearLimit]
  
  inline def wrapperOffline: typings.microsoftGraph.microsoftGraphStrings.wrapperOffline = "wrapperOffline".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperOffline]
  
  inline def wrapperOpened: typings.microsoftGraph.microsoftGraphStrings.wrapperOpened = "wrapperOpened".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperOpened]
  
  inline def wrapperOverTemperature: typings.microsoftGraph.microsoftGraphStrings.wrapperOverTemperature = "wrapperOverTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperOverTemperature]
  
  inline def wrapperPowerSaver: typings.microsoftGraph.microsoftGraphStrings.wrapperPowerSaver = "wrapperPowerSaver".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperPowerSaver]
  
  inline def wrapperRecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.wrapperRecoverableFailure = "wrapperRecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperRecoverableFailure]
  
  inline def wrapperRecoverableStorage: typings.microsoftGraph.microsoftGraphStrings.wrapperRecoverableStorage = "wrapperRecoverableStorage".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperRecoverableStorage]
  
  inline def wrapperRemoved: typings.microsoftGraph.microsoftGraphStrings.wrapperRemoved = "wrapperRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperRemoved]
  
  inline def wrapperResourceAdded: typings.microsoftGraph.microsoftGraphStrings.wrapperResourceAdded = "wrapperResourceAdded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperResourceAdded]
  
  inline def wrapperResourceRemoved: typings.microsoftGraph.microsoftGraphStrings.wrapperResourceRemoved = "wrapperResourceRemoved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperResourceRemoved]
  
  inline def wrapperThermistorFailure: typings.microsoftGraph.microsoftGraphStrings.wrapperThermistorFailure = "wrapperThermistorFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperThermistorFailure]
  
  inline def wrapperTimingFailure: typings.microsoftGraph.microsoftGraphStrings.wrapperTimingFailure = "wrapperTimingFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperTimingFailure]
  
  inline def wrapperTurnedOff: typings.microsoftGraph.microsoftGraphStrings.wrapperTurnedOff = "wrapperTurnedOff".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperTurnedOff]
  
  inline def wrapperTurnedOn: typings.microsoftGraph.microsoftGraphStrings.wrapperTurnedOn = "wrapperTurnedOn".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperTurnedOn]
  
  inline def wrapperUnderTemperature: typings.microsoftGraph.microsoftGraphStrings.wrapperUnderTemperature = "wrapperUnderTemperature".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperUnderTemperature]
  
  inline def wrapperUnrecoverableFailure: typings.microsoftGraph.microsoftGraphStrings.wrapperUnrecoverableFailure = "wrapperUnrecoverableFailure".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperUnrecoverableFailure]
  
  inline def wrapperUnrecoverableStorageError: typings.microsoftGraph.microsoftGraphStrings.wrapperUnrecoverableStorageError = "wrapperUnrecoverableStorageError".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperUnrecoverableStorageError]
  
  inline def wrapperWarmingUp: typings.microsoftGraph.microsoftGraphStrings.wrapperWarmingUp = "wrapperWarmingUp".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.wrapperWarmingUp]
}
