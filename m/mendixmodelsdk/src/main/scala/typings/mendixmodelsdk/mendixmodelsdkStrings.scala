package typings.mendixmodelsdk

import typings.mendixmodelsdk.structuresMod.StructureState
import typings.mendixmodelsdk.transactionManagerMod.TransactionType
import typings.mendixmodelsdk.transportInterfacesMod.CannotFixAppState
import typings.mendixmodelsdk.transportInterfacesMod.IUpdateAppJobStatus
import typings.mendixmodelsdk.transportInterfacesMod.LockType
import typings.mendixmodelsdk.transportInterfacesMod.SuccessAppState
import typings.mendixmodelsdk.transportationMod.RequestMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mendixmodelsdkStrings {
  @js.native
  sealed trait ADD extends js.Object
  
  @js.native
  sealed trait APP_NOT_FOUND extends SuccessAppState
  
  @js.native
  sealed trait ATTACH_ELEMENT extends js.Object
  
  @js.native
  sealed trait BUSY_PROVISIONING extends CannotFixAppState
  
  @js.native
  sealed trait CHANGE extends js.Object
  
  @js.native
  sealed trait CREATE_ELEMENT_TREE extends js.Object
  
  @js.native
  sealed trait CREATE_UNIT_TREE extends js.Object
  
  @js.native
  sealed trait DELETE_ELEMENT extends js.Object
  
  @js.native
  sealed trait DELETE_UNIT extends js.Object
  
  @js.native
  sealed trait DETACH_ELEMENT extends js.Object
  
  @js.native
  sealed trait FAILED extends SuccessAppState
  
  @js.native
  sealed trait FAILED_STAGING extends SuccessAppState
  
  @js.native
  sealed trait INVALID_OPENID extends CannotFixAppState
  
  @js.native
  sealed trait INVALID_PROJECTID extends CannotFixAppState
  
  @js.native
  sealed trait Licensed extends js.Object
  
  @js.native
  sealed trait MXBUILD_STARTED extends SuccessAppState
  
  @js.native
  sealed trait NO_WEBMODELER_TARGET_SELECTED extends CannotFixAppState
  
  @js.native
  sealed trait REMOVE extends js.Object
  
  @js.native
  sealed trait STAGING extends SuccessAppState
  
  @js.native
  sealed trait STARTED extends SuccessAppState
  
  @js.native
  sealed trait STARTING extends SuccessAppState
  
  @js.native
  sealed trait STOPPED extends SuccessAppState
  
  @js.native
  sealed trait Sandbox extends js.Object
  
  @js.native
  sealed trait UNKNOWN extends CannotFixAppState
  
  @js.native
  sealed trait UNKNOWN_ACCOUNT extends CannotFixAppState
  
  @js.native
  sealed trait UNKNOWN_DEPLOYER extends CannotFixAppState
  
  @js.native
  sealed trait UNKNOWN_PROJECT extends CannotFixAppState
  
  @js.native
  sealed trait UNLINKED extends CannotFixAppState
  
  @js.native
  sealed trait UPDATE_PROPERTY_VALUE extends js.Object
  
  @js.native
  sealed trait UPDATING extends SuccessAppState
  
  @js.native
  sealed trait Unlicensed extends js.Object
  
  @js.native
  sealed trait attached extends StructureState
  
  @js.native
  sealed trait bidi extends LockType
  
  @js.native
  sealed trait buildResult extends js.Object
  
  @js.native
  sealed trait commit extends LockType
  
  @js.native
  sealed trait `commit-wc` extends LockType
  
  @js.native
  sealed trait consistencyerrors extends IUpdateAppJobStatus
  
  @js.native
  sealed trait conversion extends LockType
  
  @js.native
  sealed trait delete extends RequestMethod
  
  @js.native
  sealed trait deleted extends StructureState
  
  @js.native
  sealed trait deltas extends js.Object
  
  @js.native
  sealed trait detached extends StructureState
  
  @js.native
  sealed trait edit extends LockType
  
  @js.native
  sealed trait explicit extends TransactionType
  
  @js.native
  sealed trait fail extends js.Object
  
  @js.native
  sealed trait failed_ extends IUpdateAppJobStatus
  
  @js.native
  sealed trait fast extends js.Object
  
  @js.native
  sealed trait fileChanges extends js.Object
  
  @js.native
  sealed trait full extends js.Object
  
  @js.native
  sealed trait get extends RequestMethod
  
  @js.native
  sealed trait `implicit` extends TransactionType
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait `new` extends StructureState
  
  @js.native
  sealed trait post extends RequestMethod
  
  @js.native
  sealed trait provisioning extends IUpdateAppJobStatus
  
  @js.native
  sealed trait put extends RequestMethod
  
  @js.native
  sealed trait resuming extends IUpdateAppJobStatus
  
  @js.native
  sealed trait started_ extends IUpdateAppJobStatus
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait switch extends LockType
  
  @js.native
  sealed trait update extends LockType
  
  @js.native
  sealed trait updating_ extends IUpdateAppJobStatus
  
  @js.native
  sealed trait workingCopyData extends js.Object
  
  @js.native
  sealed trait zip extends js.Object
  
  @scala.inline
  def ADD: ADD = "ADD".asInstanceOf[ADD]
  @scala.inline
  def APP_NOT_FOUND: APP_NOT_FOUND = "APP_NOT_FOUND".asInstanceOf[APP_NOT_FOUND]
  @scala.inline
  def ATTACH_ELEMENT: ATTACH_ELEMENT = "ATTACH_ELEMENT".asInstanceOf[ATTACH_ELEMENT]
  @scala.inline
  def BUSY_PROVISIONING: BUSY_PROVISIONING = "BUSY_PROVISIONING".asInstanceOf[BUSY_PROVISIONING]
  @scala.inline
  def CHANGE: CHANGE = "CHANGE".asInstanceOf[CHANGE]
  @scala.inline
  def CREATE_ELEMENT_TREE: CREATE_ELEMENT_TREE = "CREATE_ELEMENT_TREE".asInstanceOf[CREATE_ELEMENT_TREE]
  @scala.inline
  def CREATE_UNIT_TREE: CREATE_UNIT_TREE = "CREATE_UNIT_TREE".asInstanceOf[CREATE_UNIT_TREE]
  @scala.inline
  def DELETE_ELEMENT: DELETE_ELEMENT = "DELETE_ELEMENT".asInstanceOf[DELETE_ELEMENT]
  @scala.inline
  def DELETE_UNIT: DELETE_UNIT = "DELETE_UNIT".asInstanceOf[DELETE_UNIT]
  @scala.inline
  def DETACH_ELEMENT: DETACH_ELEMENT = "DETACH_ELEMENT".asInstanceOf[DETACH_ELEMENT]
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def FAILED_STAGING: FAILED_STAGING = "FAILED_STAGING".asInstanceOf[FAILED_STAGING]
  @scala.inline
  def INVALID_OPENID: INVALID_OPENID = "INVALID_OPENID".asInstanceOf[INVALID_OPENID]
  @scala.inline
  def INVALID_PROJECTID: INVALID_PROJECTID = "INVALID_PROJECTID".asInstanceOf[INVALID_PROJECTID]
  @scala.inline
  def Licensed: Licensed = "Licensed".asInstanceOf[Licensed]
  @scala.inline
  def MXBUILD_STARTED: MXBUILD_STARTED = "MXBUILD_STARTED".asInstanceOf[MXBUILD_STARTED]
  @scala.inline
  def NO_WEBMODELER_TARGET_SELECTED: NO_WEBMODELER_TARGET_SELECTED = "NO_WEBMODELER_TARGET_SELECTED".asInstanceOf[NO_WEBMODELER_TARGET_SELECTED]
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  @scala.inline
  def STAGING: STAGING = "STAGING".asInstanceOf[STAGING]
  @scala.inline
  def STARTED: STARTED = "STARTED".asInstanceOf[STARTED]
  @scala.inline
  def STARTING: STARTING = "STARTING".asInstanceOf[STARTING]
  @scala.inline
  def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  @scala.inline
  def Sandbox: Sandbox = "Sandbox".asInstanceOf[Sandbox]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def UNKNOWN_ACCOUNT: UNKNOWN_ACCOUNT = "UNKNOWN_ACCOUNT".asInstanceOf[UNKNOWN_ACCOUNT]
  @scala.inline
  def UNKNOWN_DEPLOYER: UNKNOWN_DEPLOYER = "UNKNOWN_DEPLOYER".asInstanceOf[UNKNOWN_DEPLOYER]
  @scala.inline
  def UNKNOWN_PROJECT: UNKNOWN_PROJECT = "UNKNOWN_PROJECT".asInstanceOf[UNKNOWN_PROJECT]
  @scala.inline
  def UNLINKED: UNLINKED = "UNLINKED".asInstanceOf[UNLINKED]
  @scala.inline
  def UPDATE_PROPERTY_VALUE: UPDATE_PROPERTY_VALUE = "UPDATE_PROPERTY_VALUE".asInstanceOf[UPDATE_PROPERTY_VALUE]
  @scala.inline
  def UPDATING: UPDATING = "UPDATING".asInstanceOf[UPDATING]
  @scala.inline
  def Unlicensed: Unlicensed = "Unlicensed".asInstanceOf[Unlicensed]
  @scala.inline
  def attached: attached = "attached".asInstanceOf[attached]
  @scala.inline
  def bidi: bidi = "bidi".asInstanceOf[bidi]
  @scala.inline
  def buildResult: buildResult = "buildResult".asInstanceOf[buildResult]
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  @scala.inline
  def `commit-wc`: `commit-wc` = "commit-wc".asInstanceOf[`commit-wc`]
  @scala.inline
  def consistencyerrors: consistencyerrors = "consistencyerrors".asInstanceOf[consistencyerrors]
  @scala.inline
  def conversion: conversion = "conversion".asInstanceOf[conversion]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  @scala.inline
  def deltas: deltas = "deltas".asInstanceOf[deltas]
  @scala.inline
  def detached: detached = "detached".asInstanceOf[detached]
  @scala.inline
  def edit: edit = "edit".asInstanceOf[edit]
  @scala.inline
  def explicit: explicit = "explicit".asInstanceOf[explicit]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def failed_ : failed_ = "failed".asInstanceOf[failed_]
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  @scala.inline
  def fileChanges: fileChanges = "fileChanges".asInstanceOf[fileChanges]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def provisioning: provisioning = "provisioning".asInstanceOf[provisioning]
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  @scala.inline
  def resuming: resuming = "resuming".asInstanceOf[resuming]
  @scala.inline
  def started_ : started_ = "started".asInstanceOf[started_]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def switch: switch = "switch".asInstanceOf[switch]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def updating_ : updating_ = "updating".asInstanceOf[updating_]
  @scala.inline
  def workingCopyData: workingCopyData = "workingCopyData".asInstanceOf[workingCopyData]
  @scala.inline
  def zip: zip = "zip".asInstanceOf[zip]
}

